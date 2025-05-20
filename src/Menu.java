import java.util.*;
public class Menu {
    Scanner scan= new Scanner(System.in);

    public void welcome(){
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
        menu();
    }

    public void menu(){
        System.out.println("""
                ==========================
                        🌳Preet🌳
                ==========================
                Welcome to Preet! This is a place where you can grow and learn.
                You can choose to start your journey or log in if you already have an account.
                1. Start
                2. Log in
                3. Exit
                """);
        int pilih = scan.nextInt();
        switch (pilih) {
            case 1 -> start();
            case 2 -> login();
            case 3 -> {
                System.out.println("Exiting the program...");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    public void start(){
        System.out.println("Hi! Welcome to Preet. Let's get started.");
        System.out.println("Please enter your username:");
        String username = scan.next();
        System.out.println("Please enter your password:");
        String password = scan.next();
        //pake hashmap?
    }

    public void login(){
        System.out.println("Please enter your username:");
        String username = scan.next();
        System.out.println("Please enter your password:");
        String password = scan.next();
        // Here you would typically check the username and password against a database or a list of users
        // For now, we'll just print them out
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}