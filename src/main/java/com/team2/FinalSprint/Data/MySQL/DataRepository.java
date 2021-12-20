package com.team2.FinalSprint.Data.MySQL;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "data_object", path = "data_object")
public interface DataRepository extends PagingAndSortingRepository<DataObject, Integer> {
    //https://bushansirgur.in/spring-data-jpa-finder-query-methods-by-multiple-field-names-with-examples/

    //MySQL database Repository
    List<DataObject>findById(@Param("id")int id);
    List<DataObject>findByCompany(@Param("company")String company);
    List<DataObject>findByCity(@Param("city")String city);
    List<DataObject>findByJobOpening(@Param("jobOpening")String jobOpening);
    List<DataObject>findByContact(@Param("contact")String contact);

    List<DataObject>findByCompanyOrCityOrJobOpeningOrContactIgnoreCase(
            @Param("company")String company,
            @Param("city")String city,
            @Param("jobOpening")String jobOpening,
            @Param("contact")String contact
    );
}
