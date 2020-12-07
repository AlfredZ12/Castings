/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import ObjetosNegocio.Cliente;
import ObjetosNegocio.Perfil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
public class PerfilRepository extends BaseRepository<Object> {

    public PerfilRepository() {
    }

    public void Agregar(Object object) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<Perfil> Lista() {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("Perfil.findAll", Perfil.class);
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
     public List<Perfil> Lista(Integer id) {
         List<Perfil> aux = null;
        EntityManager em = super.getManager();
         em.getTransaction().begin();
         try {
             Query query = em.createNamedQuery("Perfil.findByIdperfil", Perfil.class);
             query.setParameter("idperfil", id);
             aux = query.getResultList();
             em.getTransaction().commit();
             return aux;

         } catch (Exception e) {
             e.printStackTrace();
             em.getTransaction().rollback();
         } finally {
             em.close();
         }
         return null;

    }
    
}
