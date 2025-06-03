import java.io.*;

public class UserManager {
    private static final String USER_FOLDER = "users";

    static {
        File folder = new File(USER_FOLDER);
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Created 'users/' folder.");
            } else {
                System.err.println("Failed to create folder.");
            }
        }
    }

    public static void saveToFile(User user) {
        File file = new File(USER_FOLDER + "/" + user.getUsername() + ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(user.getUsername() + "\n");
            writer.write(user.getPassword() + "\n");
            writer.write(user.getLevel() + "\n");
        } catch (IOException e) {
            System.err.println("Failed to save user data:");
            e.printStackTrace();
        }
    }

    public static User loadFromFile(String username) {
        File file = new File(USER_FOLDER + "/" + username + ".txt");
        if (!file.exists())
            return null;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String uname = reader.readLine();
            String pass = reader.readLine();
            int level = Integer.parseInt(reader.readLine());
            return new User(uname, pass, level);
        } catch (Exception e) {
            System.err.println("Error loading user:");
            e.printStackTrace();
            return null;
        }
    }
}