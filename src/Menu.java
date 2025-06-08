import java.util.*;

public class Menu {
    private Scanner s = new Scanner(System.in);
    private String currentUser = null;

    public void welcome() {
        System.out.println("""
                Welcome to Preet
                \033[1m"I was once a seed — small, still, and buried.
                But something inside me wanted the light."\033[0m

                You are not planting a tree.
                \033[1mYou are the tree.\033[0m

                Each day, your actions water, movement, rest are sunlight and rain.

                You stretch a little taller.
                Your roots grow deeper.
                Your leaves grow stronger.

                A gentle companion watches over you,
                cheering when you rise,
                comforting when you fall.

                There is no final stage.
                Only seasons.
                Some fast, some slow.
                All part of your becoming.

                \033[0;37m\033[01You are the tree.
                And you are still growing.\033[m
                """);
        System.out.print("Press Enter to continue...");
        s.nextLine();
        LogReg();
    }

    public void LogReg() {
        while (currentUser == null) {
            System.out.println("\n\033[1mRoots and Branches\033[0m");
            System.out.println("1. \033[3mTake root\033[0m (Register)");
            System.out.println("2. \033[3mReturn to your grove\033[0m (Login)");
            System.out.println("3. \033[3mLet the wind carry you away\033[0m (Exit)");
            System.out.print("\nChoose your path: ");

            String choice = s.nextLine();

            switch (choice) {
                case "1":
                    register();
                    break;
                case "2":
                    login();
                    break;
                case "3":
                    System.out.println("\nMay your roots find nourishment elsewhere.");
                    System.exit(0);
                default:
                    System.out.println("\nThe wind whispers of unclear choices...");
            }
        }
    }

    private void register() {
        System.out.println("\n\033[1mTake Root in This Soil\033[0m");
        String username;

        while (true) {
            System.out.print("\nChoose your name (3-12 characters): ");
            username = s.nextLine().trim();

            if (username.length() < 3 || username.length() > 12) {
                System.out.println("⚠️ A name must be strong enough to hold, but light enough to grow.");
                continue;
            }

            if (UserManager.loadFromFile(username) != null) {
                System.out.println("🌳 This name already grows in our grove. Choose another.");
            } else {
                break;
            }
        }

        String password;
        while (true) {
            System.out.print("Choose a password (min 4 characters): ");
            password = s.nextLine().trim();
            if (password.length() < 4) {
                System.out.println("Your roots need a bit more strength.");
            } else {
                break;
            }
        }

        int level;
        level = 1;

        User newUser = new User(username, password, level);
        UserManager.saveToFile(newUser);
        System.out.println("\nAccount created! Welcome, " + username + "!");
    }

    private void login() {
        System.out.print("Username: ");
        String username = s.nextLine().trim();

        System.out.print("Password: ");
        String password = s.nextLine().trim();

        User user = UserManager.loadFromFile(username);

        if (user == null) {
            System.out.println("User not found or file corrupted.");
        } else if (!user.getPassword().equals(password)) {
            System.out.println("Incorrect password.");
        } else {
            System.out.println("Login successful! Welcome back, " + user.getUsername() + "!");
            mainmenu(user);
        }
    }

    public void mainmenu(User user) {
        System.out.println();
        System.out.println("=== Main Menu ===");
        System.out.println("1. Do Quest\n2. View Tree\n3. View Animals\n4. Play Memory Game\n0. Exit");
        int choice = -1;
        while (choice != 0) {
            do {
                System.out.print("Choose an option: ");
                try {
                    choice = s.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    s.next();
                    choice = -1;
                }
            } while (choice < 0 || choice > 4);
            switch (choice) {
                case 1:
                    doQuest(user);
                    break;
                case 2:
                    viewTree(user);
                    break;
                case 3:
                    viewAnimals(user);
                case 4:
                    playMemoryGame(user);
                    break;
                case 0:
                    System.out.println("\nMay your roots find nourishment elsewhere.");
                    System.exit(0);
                default:
                    System.out.println("\nThe wind whispers of unclear choices...");
            }
        }
    }

    public void playMemoryGame(User user) {
        for (int i = 0; i < 99; i++) {
            System.out.println();
        }
    }

    public void viewAnimals(User user) {
        // Display animals yang ada di grove
        System.out.println("Here are the animals in your grove:");
        // display emoji pake intejer and animalnya
        // jadi tambah string di pet trs namain emoji
        System.out.println();
        System.out.println("=== MY ANIMALSS ===");
        if (user.pets.isEmpty()) {
            System.out.println("\nYou feel a presence missing beside you...");
            createOrChoosePet(user);
        }
        for (int i = 0; i < user.pets.size(); i++) {
            Pet pet = user.pets.get(i);
            System.out.print((i + 1) + ". " + pet.getName() + " ");
        }
    }

    public void createOrChoosePet(User user) {
        Pet newPet = null;
        System.out.println("\nChoose a companion for your journey:");
        System.out.println("1. Frog 🐸");
        System.out.println("2. Bird 🦜");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                newPet = new Frog("Frog", 10);
                break;
            case 2:
                newPet = new Bird("Bird", 10);
                break;
            default:
                System.out.println("Invalid choice. No pet was created.");
                return;
        }

        user.pets.add(newPet);
        UserManager.saveToFile(user);
        System.out.println("🎉 A new friend joins your grove: " + newPet.getName() + "!");
    }

    public void viewTree(User user) {
        // Display treenya i still need to draw
    }

    public void doQuest(User user) {
        // ini dia display quest yang bakal dilakukan
    }
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
