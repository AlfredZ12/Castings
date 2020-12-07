/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import ObjetosNegocio.Agentecasting;
import ObjetosNegocio.Presencial;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Admin
 */
public class AgenteCastingRepository extends BaseRepository<Object>{


    public AgenteCastingRepository() {
       super();
    }

 
//  
    public void Agregar(Agentecasting agente) {

        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            em.persist(agente);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public Agentecasting BuscarId(Integer id){
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            return em.find(Agentecasting.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }
    

    public List<Agentecasting> Lista() {
        EntityManager em = super.getManager();

        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("Agentecasting.findAll", Agentecasting.class);
            return query.getResultList();

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }

    /**
     * Metodo busqueda por id
     * @param id Representa el id a buscar
     * @return regresa el nombre del id
     */
    public Agentecasting Buscar(Integer id) {
        EntityManager em = super.getManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        Query query = em.createNamedQuery("BuscarAgente", Agentecasting.class);
        query.setParameter("id", id);
        em.getTransaction().begin();
        try {
            cb.createQuery().from(Agentecasting.class);
            return (Agentecasting) query.getResultList().get(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
        return null;
    }

    public Agentecasting Buscar(String nombre) {
        EntityManager em = super.getManager();
        try {
            Query query = em.createNamedQuery("BuscarAgenteByName", Agentecasting.class);
            query.setParameter("nombre", nombre);
            em.getTransaction().begin();
            return (Agentecasting) query.getSingleResult();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
        return null;
    }

    public void setDisponibilidad(Integer id) {
        EntityManager em = super.getManager();
        try {
            em.getTransaction().begin();
            Agentecasting aux = em.find(Agentecasting.class, id);
            aux.setDisponible();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
    }
    
    public void actualizar(Integer id, Presencial casting) {
        EntityManager em = super.getManager();
        try {
            em.getTransaction().begin();
            Agentecasting aux = em.find(Agentecasting.class, id);
            aux.setDisponible();
            aux.getPresencialList().add(casting);
            em.merge(aux);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
    }

}
