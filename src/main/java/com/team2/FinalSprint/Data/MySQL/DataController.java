package com.team2.FinalSprint.Data.MySQL;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
}
