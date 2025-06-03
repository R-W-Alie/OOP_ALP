public class User {
    private String username;
    private String pass;
    private int level;

    public User(String username, String pass, int level) {
        this.username = username;
        this.pass = pass;
        this.level = 1;
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
