package entities;

public class Librarian {
    private String name;
    private String password;
    private int userId;
    private String searchString;

    public Librarian(String name, String password){
        int idGenerated = 0;
        this.name = name;
        this.password = password;
        idGenerated++;
        userId = idGenerated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
