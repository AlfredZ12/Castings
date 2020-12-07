/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import ObjetosNegocio.Casting;
import ObjetosNegocio.Cliente;
import ObjetosNegocio.Fase;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
public class FaseRepository extends BaseRepository<Object> {

    public FaseRepository() {
        super();
    }
    
    
    public List<Fase> Lista() {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("Fase.findAll", Fase.class);
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

    public Fase Agregar(Fase fase) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            em.persist(fase);
            em.getTransaction().commit();
            return fase;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }
      public void Actualizar(Fase fase) {
        EntityManager em = super.getManager();

        em.getTransaction().begin();
        try {

            em.merge(fase);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
      public List<Fase> ListaFaseCasting(Integer id) {
          List<Fase> aux = null;
          EntityManager em = super.getManager();

          em.getTransaction().begin();
          try {
              Query query = em.createNamedQuery("Fase.findByIdPresencial", Fase.class);
              query.setParameter("idPresencial", id);
              aux = query.getResultList();
              em.getTransaction().commit();
              return aux;
          } catch (Exception e) {
              e.printStackTrace();
              em.getTransaction().rollback();
          } finally {
              em.close();
          }
        return aux;
    }
    
}
