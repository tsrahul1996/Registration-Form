package com.example.demo2.dao;

import com.example.demo2.Model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by expert on 16/1/19.
 */
public interface RegistrationRepository extends CrudRepository<Registration, Long>,RegistrationRepositoryCustom {
Registration findByEmail(String email);
Registration findByPassword(String password);

    @Procedure(name = "RegistrationSelectAll")
    List<Registration> getAllRegistration();


}