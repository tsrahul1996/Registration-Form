package com.example.demo2.Controller;

import com.example.demo2.Model.Registration;
import com.example.demo2.Model.RegistrationRecord;
import com.example.demo2.Service.DocumentService;
import com.example.demo2.dao.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expert on 24/7/19.
 */
@RestController
@Scope("session")
public class RegistrationController {


    @Autowired
    @Qualifier("registrationImpl")
    DocumentService docService;

  //  @Autowired
   // @Qualifier("registrationImpl")
  //  DocumentService<RegistrationRecord> docService;



    @Autowired
    private RegistrationRepository RegistrationRepository;

    @GetMapping("/register")
    public String mainPage(Model model){
        return "register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public  String createRegistration( Registration record) {
         docService.saveRecords(record);
         return "mainPage";
    }

 /*   @RequestMapping(value = "/registerSelectAll1",method = RequestMethod.POST)
    public List<RegistrationRecord> registrationSelectALL(@RequestBody(required=false) String parameter) {
        return docService.selectAllRecords(parameter);
    }

    @RequestMapping(value = "/registerSelectAll",method = RequestMethod.POST)
    public Registration registrationSetlect(@RequestBody(required=false) String parameter) {
        return docService.selectRecords(parameter);
    }*/

    @Autowired
    private RegistrationRepository registrationRepository;

    @RequestMapping(value = "/registrationSelectAll", method = RequestMethod.GET)
    public ResponseEntity<List<Registration>> getAllRegistration() {

        Iterable<Registration> reg = registrationRepository.getAllRegistration();

        List<Registration> target = new ArrayList<>();
        reg.forEach(target::add);
        return new ResponseEntity<>(target, HttpStatus.OK);

    }



}
