//🐸
public class Frog extends Pet {

    public Frog(String name, int hp) {
        super(name, hp, new String[]{
            "The frog lets out a loud ribbit!",
            "The frog jumps high into the air.",
            "The frog sits still on a lily pad.",
            "The frog catches a fly with its tongue."
        });
    }

    @Override
    public void interact() {
        System.out.print("🐸 ");
        super.interact();
    }
}