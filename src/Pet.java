import java.util.Random;

public abstract class Pet {
    protected String name;
    protected int hp;
    protected String[] sentences;
    private static final Random rand = new Random();

    public Pet(String name, int hp, String[] sentences) {
        this.name = name;
        this.hp = hp;
        this.sentences = sentences;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + " (HP: " + hp + ")";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public String[] getSentences() {
        return this.sentences;
    }

    public void setSentences(String[] sentences) {
        this.sentences = sentences;
    }

    public void interact() {
        if (sentences != null && sentences.length > 0) {
            int index = rand.nextInt(sentences.length);
            System.out.println(sentences[index]);
        } else {
            System.out.println("...");
        }
    }
}
