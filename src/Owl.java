// 🦉
public class Owl extends Pet {

    public Owl(String name, int hp) {
        super(name, hp, new String[]{
            "The owl hoots softly in the dark.",
            "The owl turns its head nearly all the way around.",
            "The owl watches silently from a branch.",
            "The owl spreads its wings and glides silently."
        });
    }

    @Override
    public void interact() {
        System.out.print("🦉 ");
        super.interact();
    }
}