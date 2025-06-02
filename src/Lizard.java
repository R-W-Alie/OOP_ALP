// 🦎
public class Lizard extends Pet {

    public Lizard(String name, int hp) {
        super(name, hp, new String[]{
            "The lizard flicks its tongue quickly.",
            "The lizard climbs up a warm rock.",
            "The lizard basks under the sun.",
            "The lizard scurries across the ground."
        });
    }

    @Override
    public void interact() {
        System.out.print("🦎 ");
        super.interact();
    }
}