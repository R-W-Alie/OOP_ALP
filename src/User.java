import java.util.*;
public class User {
    private String username;
    private String pass;
    private int level;
    ArrayList<Pet> pets = new ArrayList<>();

    public User(String username, String pass, int level) {
        this.username = username;
        this.pass = pass;
        this.level = 1;
        this.pets = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return pass;
    }

    public int getLevel() {
        return level;
    }
}