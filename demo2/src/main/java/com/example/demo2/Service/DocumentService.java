package com.example.demo2.Service;


import com.example.demo2.Model.Registration;
import com.example.demo2.Model.RegistrationRecord;

import java.sql.ResultSet;
import java.util.List;

/**
 * Created by expert on 29/1/19.
 */
public interface DocumentService {



    String saveRecords(Registration record);

/*    List<RegistrationRecord> selectAllRecords(String parameter);

    ResultSet selectRecords(String parameter);*/
}
