/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import ObjetosNegocio.Casting;
import ObjetosNegocio.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;


/**
 *
 * @author Admin
 */
public class ClienteRepository extends BaseRepository<Object> {

    public ClienteRepository() {
        super();
    }


    public List<Cliente> Lista() {
   
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("Cliente.findAll", Cliente.class);
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

    public void Agregar(Cliente cliente) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public Cliente BuscarId(Integer id){
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
                        em.getTransaction().commit();

            return em.find(Cliente.class, id);
//            
//            Query query = em.createNamedQuery("BuscarClienteByID", Cliente.class);
//            query.setParameter("idCliente", id);
//            return (Cliente) query.getSingleResult();

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }
    public Cliente BuscarNombre(String nombre){
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("BuscarClienteByNombre", Cliente.class);
            query.setParameter("nombre", nombre);
            em.getTransaction().commit();
            return (Cliente) query.getSingleResult();

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }

}
