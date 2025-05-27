public abstract class Pet {
    protected String name;
    protected int hp;
    protected String sentence;

    public Pet(String name, int hp, String sentence) {
        this.name = name;
        this.hp = hp;
        this.sentence = sentence;
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

    public String getSentence() {
        return this.sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

}
