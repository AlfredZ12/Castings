/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Admin
 * @param <T>
 */
public abstract class BaseRepository<T> {

    private  EntityManagerFactory entityFactory;

    public BaseRepository() {
                        this.entityFactory = Persistence.createEntityManagerFactory("CastingPU");

    }

    public EntityManager getManager() {

        return entityFactory.createEntityManager();
    }
    

////    public abstract List<T> Lista();

    
}
