package repositories;

import entities.Account;
import entities.User;
import exceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDb {
    private final List<User> userDatabase = new ArrayList<User>();
    private Account account;

    public void addUser(User user){
        userDatabase.add(user);
    }

    public List<User> getUserDatabase() {
        return userDatabase;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public User findUserById(int userId) throws UserNotFoundException {
        User foundedUser = null;
        for(User myUser: userDatabase){
            if(myUser.getUserId() != userId) {
                throw new UserNotFoundException("User not found");
            }
            foundedUser = myUser;
        }
        return foundedUser;
    }

    public User findUserByName(String name) throws UserNotFoundException {
        User foundedUser = null;
        for(User myUser: userDatabase){
            if(!myUser.getName().equals(name)){
                throw new UserNotFoundException("User not found");
            }
            foundedUser = myUser;
        }
        return foundedUser;
    }

    public void removeUser(User user) throws UserNotFoundException {
        for(User myUser: userDatabase){
            if(!myUser.equals(user)){
                throw new UserNotFoundException("User not found");
            }
        }
        userDatabase.remove(user);
    }
}
