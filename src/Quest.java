public abstract class Quest {
    protected String name;
    protected String description;

    public Quest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void complete(User user);

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
