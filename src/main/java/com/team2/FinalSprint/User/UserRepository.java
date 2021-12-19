package com.team2.FinalSprint.User;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    User findByUsername(@Param("username") String username);
    boolean existsByUsername(@Param("username") String username);
}

/*
  Sample JSON object for creating a new User object in Postman

  {
      "username": "Emanresu",
      "password": "1234pass"
  }
 */
