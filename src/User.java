public class User {
    private String username;
    private String password;
    private int level;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.level = 1; // default
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getLevel() {
        return level;
    }
}
