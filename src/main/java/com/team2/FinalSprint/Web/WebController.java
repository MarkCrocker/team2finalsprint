package com.team2.FinalSprint.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginSubmit(@RequestParam("username_login") String username_login, @RequestParam("password_login") String password_login){
        System.out.println(username_login);
        System.out.println(password_login);
        //TODO: authenticate user by verifying with the Users table in the MySQL database
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupSubmit(@RequestParam("username") String username, @RequestParam("password") String password){
        System.out.println(username);
        System.out.println(password);
        //TODO: register user by encrypting the password and storing it in the Users table within the MySQL database
        return "index";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(){
        return "logout";
    }
}
