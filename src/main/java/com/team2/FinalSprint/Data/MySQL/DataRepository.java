package com.team2.FinalSprint.Data.MySQL;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "data_object", path = "data_object")
public interface DataRepository extends PagingAndSortingRepository<DataObject, Integer> {

    //MySQL database Repository
    List<DataObject>findById(@Param("id")int id);
    List<DataObject>findByCompany(@Param("company")String company);
    List<DataObject>findByCity(@Param("city")String city);
    List<DataObject>findByJobOpening(@Param("jobOpening")String jobOpening);
    List<DataObject>findByContact(@Param("contact")String contact);

    //https://bushansirgur.in/spring-data-jpa-finder-query-methods-by-multiple-field-names-with-examples/
    //https://www.baeldung.com/spring-jpa-like-queries

    //TODO: write custom query to SELECT * FROM table WHERE 'partial expression is LIKE any column' to replace below method
    @Query("SELECT dataObject FROM DataObject dataObject WHERE CONCAT(dataObject.company, ' ', dataObject.city, ' ', dataObject.jobOpening, ' ', dataObject.contact) LIKE %?1%")
    List<DataObject> search(String keyword);

    List<DataObject>findByCompanyOrCityOrJobOpeningOrContactContainsIgnoreCase(
            @Param("query")String company,
            @Param("city")String city,
            @Param("jobOpening")String jobOpening,
            @Param("contact")String contact
    );
}
