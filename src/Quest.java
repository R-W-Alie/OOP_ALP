public abstract class Quest {
    protected String description;
    protected int pluspoint;

    public Quest(String description, int plushp) {
        this.description = description;
        this.pluspoint = pluspoint;
    }

    public abstract void complete(User user);
    
    public String getDescription() {
        return description;
    }
}