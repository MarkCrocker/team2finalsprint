//package com.team2.FinalSprint.Data.PostgreSQL;
//
//
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//import java.util.List;
//
//
//@RepositoryRestResource(collectionResourceRel = "postgres_mock_data", path = "postgres_mock_data")
//public interface PostgresRepository extends PagingAndSortingRepository<PostgresObject, Integer> {
//    //PostgreSQL database Repository
//    List<PostgresObject>findById(@Param("id")int id);
//    List<PostgresObject>findByCompany(@Param("company")String company);
//    List<PostgresObject>findByCity(@Param("city")String city);
//    List<PostgresObject>findByJobOpening(@Param("jobOpening")String jobOpening);
//    List<PostgresObject>findByContact(@Param("contact")String contact);
//}
