import java.util.*;

public class Menu {
    private static final String USER_DATA_DIR = "user_data/";
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
        System.out.println("\n\033[1mRoots and Branches\033[0m");
        System.out.println("1. \033[3mTake root\033[0m (Register)");
        System.out.println("2. \033[3mReturn to your grove\033[0m (Login)");
        System.out.println("3. \033[3mLet the wind carry you away\033[0m (Exit)");
        System.out.print("\nChoose your path: ");
        String choice = s.nextLine();

        if (choice.equals("1")) {
            register();
        } else if (choice.equals("2")) {
            login();
        } else {
            System.out.println("Invalid choice.");
            LogReg();
        }
    }

    private void register() {
        System.out.print("Choose a username: ");
        String username = s.nextLine();
        System.out.print("Choose a password: ");
        String password = s.nextLine();

        User newUser = new User(username, password);
        UserManager.saveToFile(newUser);

        System.out.println("Account created! Welcome, " + username + "!");
    }

    private void login() {
        System.out.print("Username: ");
        String username = s.nextLine();
        System.out.print("Password: ");
        String password = s.nextLine();

        User loaded = UserManager.loadFromFile(username);

        if (loaded != null && loaded.getPassword().equals(password)) {
            System.out.println("Welcome back, " + username + "!");
        } else {
            System.out.println("Login failed. Try again.");
            LogReg();
        }
    }
}

// public void menu(){
// System.out.println("""
// ==========================
// 🌳Preet🌳
// ==========================
// Welcome to Preet! This is a place where you can grow and learn.
// You can choose to start your journey or log in if you already have an
// account.
// 1. Start
// 2. Log in
// 3. Exit
// """);
// int pilih = s.nextInt();
// switch (pilih) {
// case 1 -> start();
// case 2 -> login();
// case 3 -> {
// System.out.println("Exiting the program...");
// System.exit(0);
// }
// default -> System.out.println("Invalid choice. Please try again.");
// }
// }

// public void start(){
// System.out.println("Hi! Welcome to Preet. Let's get started.");
// System.out.println("Please enter your username:");
// String username = s.next();
// System.out.println("Please enter your password:");
// String password = scan.next();
// //pake hashmap?
// }

// public void login(){
// System.out.println("Please enter your username:");
// String username = s.next();
// System.out.println("Please enter your password:");
// String password = s.next();
// // Here you would typically check the username and password against a
// database or a list of users
// // For now, we'll just print them out
// System.out.println("Username: " + username);
// System.out.println("Password: " + password);
// }
