package com.example.demo2.dao;

import com.example.demo2.Model.Registration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

/**
 * Created by expert on 25/7/19.
 */
public class RegistrationRepositaryImpl implements RegistrationRepositoryCustom{
    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Registration> getAllRegistration() {
        StoredProcedureQuery findByYearProcedure =
                em.createNamedStoredProcedureQuery("getAllRegistration");
        return findByYearProcedure.getResultList();
    }
}
