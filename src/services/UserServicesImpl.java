package services;

import entities.Account;
import entities.Book;
import entities.User;
import repositories.UserDb;

import java.util.List;

public class UserServicesImpl implements UserServices{
    private UserDb userDb;

    public UserServicesImpl(){
        userDb = new UserDb();
    }
    @Override
    public void addUser(User user) {
        userDb.addUser(user);

    }

    @Override
    public void createAccount(Account account) {
        userDb.setAccount(account);
    }

    @Override
    public Account checkAccount() {
        return userDb.getAccount();
    }

    @Override
    public Book getBookInfo(String searchString) {
        return null;
    }

    @Override
    public boolean verifyUser(String name) {
        return false;
    }

    @Override
    public List<User> getUserDb() {
        return userDb.getUserDatabase();
    }


}
