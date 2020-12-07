/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import ObjetosNegocio.Cliente;
import ObjetosNegocio.Prueba;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
public class PruebaRepository extends BaseRepository<Object> {

    public PruebaRepository() {
        super();
    }

    public List<Prueba> Lista() {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("Prueba.findAll", Prueba.class);
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

    public Prueba Agregar(Prueba prueba) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            em.persist(prueba);
            em.getTransaction().commit();
            return prueba;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }

}
