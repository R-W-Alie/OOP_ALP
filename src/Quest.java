public abstract class Quest {
    protected String description;
    protected int plushp;

    public Quest(String description, int plushp) {
        this.description = description;
        this.plushp = plushp;
    }

    public abstract void complete(User user);
    
    public String getDescription() {
        return description;
    }
}