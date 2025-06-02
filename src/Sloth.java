// 🦥
public class Sloth extends Pet {

    public Sloth(String name, int hp) {
        super(name, hp, new String[]{
            "The sloth blinks slowly.",
            "The sloth moves one paw... very... slowly.",
            "The sloth hangs upside down from a branch.",
            "The sloth yawns and takes another nap."
        });
    }

    @Override
    public void interact() {
        System.out.print("🦥 ");
        super.interact();
    }
}