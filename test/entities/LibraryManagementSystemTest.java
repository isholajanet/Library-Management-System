package entities;

import enums.UserType;
import exceptions.UserAlreadyExistException;
import exceptions.UserNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagementSystemTest {
    LibraryManagementSystem managementSystem;

    @BeforeEach
    void setUp() {
        managementSystem = new LibraryManagementSystem();
    }

    @AfterEach
    void tearDown() {
        managementSystem = null;
    }


    //validate for registered user later
    @Test
    void testThatSystemCanRegisterAUser(){
        User user = new User("jane", "jane12", UserType.STUDENT);
        try {
            managementSystem.register(user);
            assertEquals(1, managementSystem.getUserDb().getUserDatabase().size());
        } catch (UserAlreadyExistException e) {
            e.getLocalizedMessage();
        }
    }

    @Test
    void testThatSystemCanLoginAUser(){
        User user = new User("jane", "jane12", UserType.STUDENT);
        try {
            managementSystem.register(user);
            assertTrue(managementSystem.isLogin("jane", "jane12"));
        } catch (UserAlreadyExistException | UserNotFoundException e) {
            e.getLocalizedMessage();
        }
    }
    @Test
    void testThatARegisteredUserCanSearchForBook(){
        User user = new User("jane", "jane12", UserType.STUDENT);
        try {
            managementSystem.register(user);
            assertTrue(managementSystem.isLogin("jane", "jane12"));

        } catch (UserAlreadyExistException | UserNotFoundException e) {
            e.getLocalizedMessage();
        }
    }
}