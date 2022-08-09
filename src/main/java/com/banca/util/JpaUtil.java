package com.banca.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
private static final EntityManagerFactory entitymManagerFactory;
    
    static {
        entitymManagerFactory = Persistence.createEntityManagerFactory("banca");
    }
    
    public static EntityManagerFactory getEntityManagerFactory() {
    	
        return entitymManagerFactory;
        
    }

}
