package repositories;

import entities.Account;
import entities.Student;
import entities.User;
import enums.UserType;
import exceptions.UserNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDbTest {
    private UserDb userDb;

    @BeforeEach
    void setUp() {
        userDb = new UserDb();
    }

    @AfterEach
    void tearDown() {
        userDb = null;
    }
    @Test
    void testThatSystemCanAddUser(){
        User student = new User("tope", "tope123", UserType.STUDENT);
        userDb.addUser(student);
        assertEquals(1, userDb.getUserDatabase().size());
    }
    @Test
    void testThatSystemCanAddAccount(){
        Account myAccount = new Account(2, 3, 4,5, 0.0);
        userDb.setAccount(myAccount);
        assertEquals(myAccount, userDb.getAccount());
    }
    @Test
    void testThatUserCanAddAStudent(){
        User student = new User("tope", "tope123", UserType.STUDENT);
        userDb.addUser(student);
        assertEquals("tope", student.getName());
//        assertEquals(1, student.getUserId());
    }
    @Test
    void testThatSystemCanFindUserById(){
        User user = new User("tope", "tope123", UserType.STUDENT);
        userDb.addUser(user);
        User student = new Student("tola", "tola123", UserType.STAFF);
        userDb.addUser(student);

        System.out.println(user.getUserId());
        //when

        try {
           User foundedUser = userDb.findUserById(1);
            assertEquals(user, foundedUser);
        } catch (UserNotFoundException e) {
            e.getLocalizedMessage();
        }
    }
    @Test
    void testThatSystemCanFindUserByName(){
        User user = new User("tope", "tope123", UserType.STUDENT);
        userDb.addUser(user);
        User student = new Student("tola", "tola123", UserType.STAFF);
        userDb.addUser(student);

        try{
            User foundedUser = userDb.findUserByName("tope");
            assertEquals(user, foundedUser);
        }catch(UserNotFoundException e){
            e.getLocalizedMessage();
        }
    }
    @Test
    void testThatSystemCanRemoveAUser(){
        User user = new User("tope", "tope123", UserType.STUDENT);
        userDb.addUser(user);
        User student = new Student("tola", "tola123", UserType.STAFF);
        userDb.addUser(student);

        assertEquals(2, userDb.getUserDatabase().size());
        try {
            userDb.removeUser(user);
            assertEquals(1, userDb.getUserDatabase().size());
        } catch (UserNotFoundException e) {
            e.getLocalizedMessage();
        }


    }
    @Test
    void testThatSystemCanOnlyRemoveThrowsAnExceptionWhenAnUnknownIsUserIsCalled(){
        User user = new User("tope", "tope123", UserType.STUDENT);
        userDb.addUser(user);
        User student = new Student("tola", "tola123", UserType.STAFF);
        userDb.addUser(student);
        User janet = new User("janet", "jane123", UserType.STUDENT);

        assertThrows(UserNotFoundException.class, () -> userDb.removeUser(janet));
    }
}