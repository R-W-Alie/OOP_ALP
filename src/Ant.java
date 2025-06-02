//🐜
public class Ant extends Pet{
    public Ant(String name, int hp) {
        super(name, hp, new String[]{
            "The ant marches diligently!",
            "The ant is carrying a crumb.",
            "The ant waves its antennae.",
            "The ant forms a line with others."
        });
    }

    @Override
    public void interact() {
        System.out.print("🐜 ");
        super.interact();
    }
}
