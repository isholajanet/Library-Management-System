package entities;

public class User {
    private String name;
    private int userId;
    private static int idGenerator = 0;
    private Account account;

    public User(String name){
        this.name = name;
        userId = ++idGenerator;

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
}
