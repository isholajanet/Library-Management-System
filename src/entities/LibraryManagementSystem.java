package entities;

import enums.UserType;
import exceptions.UserAlreadyExistException;
import exceptions.UserNotFoundException;
import repositories.UserDb;

import java.util.List;

public class LibraryManagementSystem {
    private boolean isLogin;
    private final UserDb userDb;

    public LibraryManagementSystem(){
        userDb = new UserDb();
    }

    public void register(User user) throws UserAlreadyExistException {
        if(userDb.contains(user)){
            throw new UserAlreadyExistException("User already exist");
        }
           userDb.addUser(user);
           System.out.println(user.getName());
    }

    public UserDb getUserDb() {
        return userDb;
    }

    public boolean isLogin(String userName, String password) throws UserNotFoundException {
        User foundedUser = userDb.findUserByName(userName);
        if(foundedUser.getName().equals(userName) && foundedUser.getPassword().equals(password)){
            isLogin = true;
        }else{
            isLogin = false;
        }
        return isLogin;
    }
}
