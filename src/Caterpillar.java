//🐛
public class Caterpillar extends Pet {

    public Caterpillar(String name, int hp) {
        super(name, hp, new String[]{
            "The caterpillar crawls slowly on a leaf.",
            "The caterpillar munches on some leaves.",
            "The caterpillar wiggles its body.",
            "The caterpillar looks sleepy... maybe it's time to cocoon."
        });
    }

    @Override
    public void interact() {
        System.out.print("🐛 ");
        super.interact();
    }
}