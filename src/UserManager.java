import java.io.*;

public class UserManager {
    public static final String USER_FOLDER = "users";

    static {
        File folder = new File(USER_FOLDER);
        if (!folder.exists()) {
            folder.mkdir();
        }
    }

    public static void saveToFile(User user) {
        File file = new File(USER_FOLDER + "/" + user.getUsername() + ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(user.getUsername() + "\n");
            writer.write(user.getPassword() + "\n");
            writer.write(user.getLevel() + "\n");

            for (Pet pet : user.pets) {
                String type;
                if (pet instanceof Frog) {
                    type = "Frog";
                } else if (pet instanceof Bird) {
                    type = "Bird";
                } else {
                    continue;
                }

                writer.write("PET:" + type + "," + pet.getName() + "," + pet.getHp() + "\n");
            }

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

            User user = new User(uname, pass, level);

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("PET:")) {
                    String[] parts = line.substring(4).split(",");
                    if (parts.length >= 3) {
                        String type = parts[0];
                        String petName = parts[1];
                        int petHp = Integer.parseInt(parts[2]);

                        Pet pet = switch (type) {
                            case "Frog" -> new Frog(petName, petHp);
                            case "Bird" -> new Bird(petName, petHp);
                            default -> null;
                        };

                        if (pet != null) {
                            user.pets.add(pet);
                        }
                    }
                }
            }

            return user;

        } catch (Exception e) {
            System.err.println("Error loading user:");
            e.printStackTrace();
            return null;
        }
    }
}
