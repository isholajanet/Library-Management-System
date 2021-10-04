package services;

import entities.Account;
import entities.Book;
import entities.User;

import java.util.List;

public interface UserServices {
    void addUser(User user);
    void createAccount(Account account);
    Account checkAccount();
    Book getBookInfo(String searchString);
    boolean verifyUser(String name);
    List<User> getUserDb();

}
