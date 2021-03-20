package org.flopez.dao;

import javax.persistence.*;

/**
 *
 * @author Fabian Lopez Reyes
 */


public abstract class GenericDao {
    
    protected static EntityManager em;
    private static EntityManagerFactory emf;
    private static final String PU = "HibernateJpaPU";
    
    public GenericDao() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PU);
        }
    }
    
    protected EntityManager getEntityManager() {
        if(em == null) {
            em = emf.createEntityManager();
        }
        
        return em;
    }
}
