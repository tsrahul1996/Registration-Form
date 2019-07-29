package com.example.demo2.dao;

import com.example.demo2.Model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by expert on 24/7/19.
 */

@Component(value = "registrationDao")
@Scope("session")
public class RegistrationDAO {

    @Autowired
    RegistrationRepository dao;

    public String save(Registration records) {
          dao.save(records);
    return "";
    }

}

