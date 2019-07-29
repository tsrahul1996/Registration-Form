package com.example.demo2.Controller;


import com.example.demo2.Service.DocumentService;
import com.example.demo2.dao.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by expert on 16/1/19.
 */
@Controller
@Scope("session")
/*@SessionAttributes("email")*/
@RequestMapping
public class LoginController {

    @Autowired
    DocumentService documentService;

    @Autowired
    private RegistrationRepository RegistrationRepository;



    @GetMapping("/main")
    public String mainPage(Model model){
        return "main";
    }

  /*  @GetMapping
    public String helloworld(){
        return "helloworld";
    }
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homePage(Model model) {
        return "home";
    }
*/

    @RequestMapping(value={"/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }


    @RequestMapping(value="/index", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }



    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model) {

           return "registrationSelectAll";
    }





    }

