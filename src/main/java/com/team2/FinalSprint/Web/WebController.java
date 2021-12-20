package com.team2.FinalSprint.Web;

import com.team2.FinalSprint.Data.MySQL.DataObject;
import com.team2.FinalSprint.Service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class WebController {
    @Autowired
    SearchService searchService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(){
        return "signup";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(){
        return "logout";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getData(Model model, @Param("keyword") String keyword){

        List<DataObject> dataObjects = searchService.findAllData(keyword);
        model.addAttribute("dataObjects", dataObjects);
        model.addAttribute("keyword",keyword);
        return "search";
    }
}
