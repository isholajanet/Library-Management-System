package entities;

import enums.UserType;

public class Student extends User{

    public Student(String name, String password, UserType userType, Account account) {
        super(name, password, userType, account);
    }

    public Student(String name, String password, UserType usertype) {
        super(name, password, usertype);
    }
}
