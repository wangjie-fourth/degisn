package command.processor;

public abstract class AbstractCommand implements Command{
    protected String primaryKey;
    protected DataSource DataSource;

    public AbstractCommand(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setDataSource(DataSource dataSource) {
        this.DataSource = dataSource;
    }

    public abstract void execute();

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }
}
