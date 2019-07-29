package com.example.demo2.Service;


import com.example.demo2.Model.Registration;
import com.example.demo2.dao.RegistrationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by expert on 29/1/19.
// */
@Service(value="registrationImpl")
@Scope("session")
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    @Qualifier("registrationDao")
    RegistrationDAO dao;





    @Override
    public String saveRecords(Registration records) {

              dao.save(records);
              return "";

    }



}
