package com.example.demo2.Controller;

import com.example.demo2.Model.Registration;
import com.example.demo2.Service.DocumentService;
import com.example.demo2.dao.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by expert on 24/7/19.
 */
@Controller
@Scope("session")
public class RegistrationController {


    @Autowired
    @Qualifier("registrationImpl")
    DocumentService docService;


    @Autowired
    private RegistrationRepository registrationRepository;


    @Autowired
    private RegistrationRepository RegistrationRepository;

    @GetMapping("/register")
    public String mainPage(Model model){
        return "register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public  String createRegistration( Registration record) {
         docService.saveRecords(record);
         return "success";
    }

 /*   @RequestMapping(value = "/registrationSelectAll", method = RequestMethod.GET)
    @ModelAttribute("target")
    public List getAllRegistration(Model model) {

        Iterable<Registration> reg = registrationRepository.getAllRegistration();

        List<Registration> target = new ArrayList<>();
        reg.forEach(target::add);
        model.addAttribute("target",target);
        return target;

    }*/
/*

    @RequestMapping(value = "/registrationSelectAll", method = RequestMethod.GET)
    public List<RegistrationRecord> getAllRegistration() {

        Iterable<Registration> reg = registrationRepository.getAllRegistration();
        List<Registration> regList = new ArrayList<>();
        reg.forEach(regList::add);
        List<RegistrationRecord> recordList = new List<RegistrationRecord>();
        RegistrationRecord regRecord = new RegistrationRecord();
        regRecord.setDetail(reg);
        recordsList.add(regRecord);
        return recordList;
    }
*/

    @RequestMapping(value = "/registrationSelectAll", method = RequestMethod.GET)
    public ModelAndView getAllRegistration(ModelAndView modelAndView) {

        Iterable<Registration> reg = registrationRepository.getAllRegistration();

        List<Registration> target = new ArrayList<>();
        reg.forEach(target::add);

        modelAndView.addObject("target",target);
        modelAndView.setViewName("main");

        return modelAndView;

    }


}
