package entities;

import enums.UserType;

public class User {
    private String name;
    private UserType userType;
    private String password;
    private int userId;
    private static int idGenerator = 0;
    private Account account;

    public User(String name, String password, UserType userType, Account account){
        this.name = name;
        this.password = password;
        this.userType = userType;
        userId = ++idGenerator;
        this.account = account;

    }

    public User(String name, String password, UserType userType) {
        this.name = name;
        this.password = password;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userType=" + userType +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                ", account=" + account +
                '}';
    }
}
