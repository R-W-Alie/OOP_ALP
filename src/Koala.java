// 🐨
public class Koala extends Pet {

    public Koala(String name, int hp) {
        super(name, hp, new String[]{
            "The koala munches quietly on eucalyptus leaves.",
            "The koala yawns and climbs a tree slowly.",
            "The koala curls up for a nap.",
            "The koala blinks sleepily and hugs the tree."
        });
    }

    @Override
    public void interact() {
        System.out.print("🐨 ");
        super.interact();
    }
}