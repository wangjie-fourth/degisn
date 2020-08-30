package composite;

public abstract class Entity {
    protected final  String entityName;

    protected Entity(String entityName) {
        this.entityName = entityName;
    }

    // Used for company type
    public abstract void add(Entity entity);

    public abstract  void remove(Entity entity);

    public abstract void displayConstruct(int curLevel);

    // Used for department type
    public abstract void showDuty();
}
