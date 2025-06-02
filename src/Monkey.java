//🐵
public class Monkey extends Pet {

    public Monkey(String name, int hp) {
        super(name, hp, new String[]{
            "The monkey swings playfully from tree to tree.",
            "The monkey chatters and makes funny faces.",
            "The monkey peels a banana with skill.",
            "The monkey scratches its head curiously."
        });
    }

    @Override
    public void interact() {
        System.out.print("🐒 ");
        super.interact();
    }
}