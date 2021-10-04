package entities;

import enums.UserType;

public class Staff extends User{

    public Staff(String name, String password, UserType userType, Account account) {

        super(name, password, userType, account);
    }
}
