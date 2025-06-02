//🦜
public class Bird extends Pet {

    public Bird(String name, int hp) {
        super(name, hp, new String[]{
            "The bird sings a cheerful melody.",
            "The bird flaps its wings and takes flight.",
            "The bird pecks at some seeds.",
            "The bird tilts its head curiously."
        });
    }

    @Override
    public void interact() {
        System.out.print("🐦 ");
        super.interact();
    }
}