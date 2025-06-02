// 🐝
public class Bee extends Pet {

    public Bee(String name, int hp) {
        super(name, hp, new String[]{
            "The bee buzzes around the flowers.",
            "The bee collects nectar.",
            "The bee dances to tell others where the food is.",
            "The bee defends its hive bravely."
        });
    }

    @Override
    public void interact() {
        System.out.print("🐝 ");
        super.interact();
    }
}