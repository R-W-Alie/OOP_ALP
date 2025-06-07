public abstract class Quest {
    protected String description;
    protected int plusHp;

    public Quest(String description, int plusHp) {
        this.description = description;
        this.plusHp = plusHp;
    }

    public abstract void complete(User user);
    
    public String getDescription() {
        return description;
    }
}