import java.util.*;

public class User {
    private String username;
    private String pass;
    private int level;
    private int point;
    ArrayList<Pet> pets = new ArrayList<>();

    public User(String username, String pass, int level, int point) {
        this.username = username;
        this.pass = pass;
        this.level = 1;
        this.point = point;
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

    public void increaseLevel(int amount) {
        this.level += amount;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", level=" + level +
                ", pets=" + pets +
                '}';
    }
}