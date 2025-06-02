// 🕷️
public class Spider extends Pet {

    public Spider(String name, int hp) {
        super(name, hp, new String[]{
            "The spider spins a delicate web.",
            "The spider scuttles quickly across the floor.",
            "The spider dangles from a silk thread.",
            "The spider hides in a dark corner."
        });
    }

    @Override
    public void interact() {
        System.out.print("🕷️ ");
        super.interact();
    }
}