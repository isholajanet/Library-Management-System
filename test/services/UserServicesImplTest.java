package services;

import entities.Account;
import entities.User;
import enums.UserType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServicesImplTest {
    UserServices userServices;

    @BeforeEach
    void setUp() {
        userServices = new UserServicesImpl();
    }

    @Test
    void testThatUserCanBeAdded(){
        Account account = new Account(0,0,0,0,0.0);
        User newUser = new User("jane", "jane12", UserType.STUDENT, account);
        userServices.addUser(newUser);
        assertEquals(1, userServices.getUserDb().size());
    }
    @Test
    void testThatAccountCanBeCreatedForAUser(){
        Account account = new Account(0,0,0,0,0.0);
        User newUser = new User("jane", "jane12", UserType.STUDENT, account);
        userServices.createAccount(account);
        Account foundedAccount = newUser.getAccount();
        assertEquals(foundedAccount, account);
    }
    @Test
    void testThatSystemCanCheckUserAccount(){
        Account account = new Account(0,0,0,0,0.0);
        User newUser = new User("jane", "jane12", UserType.STUDENT, account);
        userServices.createAccount(account);
        Account foundedAccount = userServices.checkAccount();
        assertEquals(account, foundedAccount);
    }
    @Test
    void testThatSystemCanGetBookInfo(){

    }
}