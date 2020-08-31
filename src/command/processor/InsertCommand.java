package command.processor;

public class InsertCommand extends AbstractCommand{

    public InsertCommand(String primaryKey) {
        super(primaryKey);
    }

    @Override
    public void execute() {
        DataSource.insert(primaryKey);
    }

    @Override
    public void undo() {
        System.out.println("Undo insert command from " + this.DataSource);
    }
}
