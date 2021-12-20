package com.team2.FinalSprint.Web;

import com.team2.FinalSprint.Btree.BST;
import com.team2.FinalSprint.Data.MySQL.DataObject;
import com.team2.FinalSprint.Service.SearchService;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
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
    public String getData(Model model, @Param("keyword") String keyword, @Param("select_database") String select_database){
        //TODO: process data from correct database from user choice
        List<DataObject> dataObjects = searchService.findAllData(keyword);
        model.addAttribute("dataObjects", dataObjects);
        model.addAttribute("keyword",keyword);
        model.addAttribute("select_database",select_database);
        return "search";
    }

    @RequestMapping(value = "/treesort", method = RequestMethod.GET)
    public String treesort(){
        return "treesort";
    }

    @RequestMapping(value = "/bst", method = RequestMethod.GET)
    public String getBst(Model model, @Param("data") String data) {
        //TODO: clean up this method, extract some of the process into a service object
        String[] stringArray = data.split(",");
        int size = stringArray.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(stringArray[i]);
        }
        BST bst = new BST(arr[0]);
        for (int num : arr) {
            bst.insert(bst.node, num);
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(bst);
            System.out.println(jsonInString);
            model.addAttribute("tree", jsonInString);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //For debugging
        bst.inOrder(bst.node);

        model.addAttribute("data", data);
        //TODO: remove placeholder 'data' from below, insert binary search tree sorted array
        model.addAttribute("sorted", data);
        return "bst";
    }
}
