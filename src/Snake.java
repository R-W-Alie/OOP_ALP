// 🐍
public class Snake extends Pet {

    public Snake(String name, int hp) {
        super(name, hp, new String[]{
            "The snake hisses softly.",
            "The snake slithers across the ground.",
            "The snake flicks its tongue rapidly.",
            "The snake coils up and watches you carefully."
        });
    }

    @Override
    public void interact() {
        System.out.print("🐍 ");
        super.interact();
    }
}