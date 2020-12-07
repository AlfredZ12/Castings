/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import ObjetosNegocio.Administrador;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
public class AdministradorRepository extends BaseRepository<Object> {

    public AdministradorRepository() {
        super();
    }
    
    public boolean Autenticacion(String usuario, String Contrasena) {
        EntityManager em = super.getManager();
        try {
            em.getTransaction().begin();
            Query query = em.createNamedQuery("Autenticacion", Administrador.class);
            query.setParameter("usuario", usuario);
            query.setParameter("contrasena", Contrasena);

            query.getSingleResult();
            return true;
        } catch (Exception e) {
            e.getMessage();
        } finally {
            em.close();
        }

        return false;
    }

}
