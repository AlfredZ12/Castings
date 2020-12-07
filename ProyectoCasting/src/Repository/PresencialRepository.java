/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import ObjetosNegocio.Cliente;
import ObjetosNegocio.Presencial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
public class PresencialRepository extends BaseRepository<Object> {

    public PresencialRepository() {
        super();
    }
    
    public List<Presencial> Lista() {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("Presencial.findAll", Presencial.class);
            em.getTransaction().commit();
            return query.getResultList();

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;

    }
   
    public Presencial BuscarID(Integer id) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            return em.find(Presencial.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;

    }
    public Presencial BuscarNombre(String nombre) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("Presencial.BuscarByName", Presencial.class);
            query.setParameter("nombre", nombre);
            return (Presencial) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;

    }
    public void Agregar(Presencial presencial) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            em.persist(presencial);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public void Actualizar(Presencial presencial) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            em.merge(presencial);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
