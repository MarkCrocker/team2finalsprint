package com.team2.FinalSprint.Data.MySQL;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    /**
     * Returns a JSON list containing all data
     *
     * @return Query results from the table made by data repository
     */
    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public Iterable<DataObject> getAllData() {
        System.out.println(dataRepository.findAll());
        return dataRepository.findAll();
    }

//  Replaced in WebController, might be obsolete, leaving until confirmed.

//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String searchSubmit(@RequestParam("search_input") String search_input, @RequestParam("select_database") String select_database){
//        //TODO: replace with proper database decision logic
//        System.out.println("Database selected:" + select_database);
//
//        if(search_input.trim().length() < 1){
//            return "redirect:/";
//        }
//        List<DataObject> dataObjects = dataRepository.findByCompanyOrCityOrJobOpeningOrContactContainsIgnoreCase(search_input,search_input,search_input,search_input);
//
//        for(DataObject dataObject : dataObjects){
//            //TODO: replace the console print with a method to send the data to Thymeleaf template
//            System.out.println(dataObject.getCompany());
//            System.out.println(dataObject.getCity());
//            System.out.println(dataObject.getJobOpening());
//            System.out.println(dataObject.getContact());
//        }
//        return "search";
//    }

}
