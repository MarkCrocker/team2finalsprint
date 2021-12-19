package com.team2.FinalSprint.Data.MySQL;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "mock_data", path = "mock_data")
public interface DataRepository extends PagingAndSortingRepository<DataObject, Integer> {
    //MySQL database Repository
    List<DataObject>findById(@Param("id")int id);
    List<DataObject>findByCompany(@Param("company")String company);
    List<DataObject>findByCity(@Param("city")String city);
    List<DataObject>findByJobOpening(@Param("jobOpening")String jobOpening);
    List<DataObject>findByContact(@Param("contact")String contact);
}
