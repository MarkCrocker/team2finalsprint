package com.team2.FinalSprint.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * Returns a JSON list containing all registered Users
     *
     * @return Query results from the table made by user repository
     */
    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    //TODO: Add GetMapping endpoint to use for user authentication

    /**
     * Inserts a User object as a new row in the 'users' table
     * of the MySQL server defined in 'application.properties'.
     *
     * @param user    User JSON object containing fields for all table columns
     * @return        Save the User object into the table
     */
    @PostMapping("/users/register")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
