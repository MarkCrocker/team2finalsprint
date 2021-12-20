package com.team2.FinalSprint.Service;

import com.team2.FinalSprint.Data.MySQL.DataObject;
import com.team2.FinalSprint.Data.MySQL.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SearchService {
    @Autowired
    private DataRepository dataRepository;

    public List<DataObject> findAllData(String keyword){
        if (keyword != null) {
            return dataRepository.search(keyword);
        }
        return (List<DataObject>) dataRepository.findAll();
    }
}
