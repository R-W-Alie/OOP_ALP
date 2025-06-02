import java.io.*;

public class UserManager {
    private static final String USER_DATA = "users";

    static {
        File folder = new File(USER_DATA);
        if (!folder.exists()) {
            folder.mkdir();
        }
    }

    public static void saveToFile(User user) {
        String fileName = USER_DATA + "/" + user.getUsername() + ".txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(user.getUsername() + "\n");
            writer.write(user.getPassword() + "\n");
            writer.write(user.getLevel() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }

    public static User loadFromFile(String username) {
        String fileName = USER_DATA + "/" + username + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String uname = reader.readLine();
            String pass = reader.readLine();
            int level = Integer.parseInt(reader.readLine());

            return new User(uname, pass);
        } catch (IOException e) {
            System.out.println("User not found or file error.");
            return null;
        }
    }
}
