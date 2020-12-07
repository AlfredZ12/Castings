/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import ObjetosNegocio.Cliente;
import ObjetosNegocio.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
public class PersonaRepository extends BaseRepository<Object>{

    public PersonaRepository() {
        super();
    }

    

    public Persona agregar(Persona object) {
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return null;
    }
    public Persona obtener(Integer id){
        EntityManager em  = super.getManager();
        em.getTransaction().begin();
        try{
        return em.find(Persona.class, id);
        }finally{
            em.close();
        }
        
    
    }
    public void editar(Persona persona){
        
    }
    
    public void eliminar(Persona persona){
    
    }

    public List<Persona> Lista() {
        
        EntityManager em = super.getManager();
        em.getTransaction().begin();
        try {
            Query query = em.createNamedQuery("Persona.findAll", Persona.class);
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


  

    
    

}
