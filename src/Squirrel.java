// 🐿️
public class Squirrel extends Pet {

    public Squirrel(String name, int hp) {
        super(name, hp, new String[]{
            "The squirrel scurries up a tree.",
            "The squirrel nibbles on an acorn.",
            "The squirrel flicks its fluffy tail.",
            "The squirrel hides its food in the ground."
        });
    }

    @Override
    public void interact() {
        System.out.print("🐿️ ");
        super.interact();
    }
}