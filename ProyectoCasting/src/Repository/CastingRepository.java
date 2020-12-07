/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import ObjetosNegocio.Casting;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

/**
 *
 * @author Admin
 */
public class CastingRepository extends BaseRepository<Object> {

    public CastingRepository() {
        super();
    }

    public Casting Agregar(Casting casting) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            em.persist(casting);
            em.getTransaction().commit();
            return casting;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }

    public List<Casting> Lista() {
   
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("Casting.findAll", Casting.class);
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
    
    public Casting BuscarporID(Integer id){
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            return em.find(Casting.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }
    
    public void Actualizar(Casting casting){
         EntityManager em = super.getManager();

        em.getTransaction().begin();
        try {

              em.merge(casting);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }


}
