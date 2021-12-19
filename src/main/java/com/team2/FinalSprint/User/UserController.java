package com.team2.FinalSprint.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * Returns a JSON list containing all registered Users
     *
     * @return Query results from the table made by user repository
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }


    /**
     *
     * @param username_login
     * @param password_login
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginSubmit(@RequestParam("username_login") String username_login, @RequestParam("password_login") String password_login){
        if (userRepository.existsByUsername(username_login)){
            User user = userRepository.findByUsername(username_login);
            //TODO: add encrypted password checking
            if(password_login.equals(user.getPassword())){
                System.out.println("Authenticated");
                //TODO: add proper authentication and sessions to keep user logged in
            } else { System.out.println("Failed to log in."); }
        } else {System.out.println("Username doesnt exist");}
        return "index";
    }

    /**
     * Inserts a User object as a new row in the 'users' table
     * of the MySQL server defined in 'application.properties'.
     *
     * @return        Save the User object into the table
     */
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String createUser(@RequestParam("username") String username, @RequestParam("password") String password){
        User user = new User();
        user.setUsername(username);
        //TODO: save encrypted password instead of plain text
        user.setPassword(password);
        userRepository.save(user);
        return "index";
    }
}
