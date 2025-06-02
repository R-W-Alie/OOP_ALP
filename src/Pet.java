import java.util.Random;

public abstract class Pet {
    protected String name;
    protected int hp;
    protected String[] sentences;
    private Random rand = new Random();

    public Pet(String name, int hp, String[] sentences) {
        this.name = name;
        this.hp = hp;
        this.sentences = sentences;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
