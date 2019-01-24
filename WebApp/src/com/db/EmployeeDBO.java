package com.db;

import com.model.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeDBO {
    
    private static final String PU_NAME = "WorkPU";
    private static EntityManagerFactory emf = null;
    
    public List<EmployeeEntity> getEmployees() {
        EntityManager em = getEntityManager();

        TypedQuery<EmployeeEntity> query = em.createQuery("select x from EmployeeEntity x", EmployeeEntity.class);
        
        List<EmployeeEntity> ret = query.getResultList();
        
        return ret;
    }

    private static EntityManager getEntityManager() {
        if (emf == null) {
            initEntityManagerFactory();
        }
        return emf.createEntityManager();
    }

    private static void initEntityManagerFactory() {
        if (emf != null) {
            return;
        }
        emf = Persistence.createEntityManagerFactory(PU_NAME);
    }
}
