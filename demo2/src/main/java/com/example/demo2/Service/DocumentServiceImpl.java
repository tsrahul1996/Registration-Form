package com.example.demo2.Service;


import com.example.demo2.Model.Registration;
import com.example.demo2.Model.RegistrationRecord;
import com.example.demo2.dao.RegistrationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;

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

  /*  @Override
    public List<RegistrationRecord> selectAllRecords(String inputParameter) {

   //     HashMap<String, Object> storedProcedureInput = new HashMap<>();
        String procedureName="RegistrationSelectAll";

        //       return dao.selectAllRecords(storedProcedureInput, procedureName);
        return dao.selectAllRecords(procedureName);
        }

    @Override
    public ResultSet selectRecords(String inputParameter) {

        //     HashMap<String, Object> storedProcedureInput = new HashMap<>();
        String procedureName="RegistrationSelectAll";

        //       return dao.selectAllRecords(storedProcedureInput, procedureName);
        return dao.selectRecords(procedureName);
    }
*/


}
