package com.team2.FinalSprint.Data.MySQL;

import com.team2.FinalSprint.Data.MySQL.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="DataObject")
public class DataController {
    @Autowired
    private final DataRepository dataRepository;

    @GetMapping("/data")
    public DataController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }
}
