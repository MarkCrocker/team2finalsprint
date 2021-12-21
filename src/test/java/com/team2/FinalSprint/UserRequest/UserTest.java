package com.team2.FinalSprint.UserRequest;

import com.team2.FinalSprint.User.User;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    @Test
    void testLogin() {
        User realUserTest = new User();
        realUserTest.setPassword("newpassword");
        realUserTest.setUsername("newname");
        assertEquals("newpassword", realUserTest.getPassword());
        assertEquals("newname", realUserTest.getUsername());
    }
}
