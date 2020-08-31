package command.processor;

public class DeleteCommand extends AbstractCommand{


    public DeleteCommand(String primaryKey) {
        super(primaryKey);
    }

    @Override
    public void execute() {
        DataSource.delete(primaryKey);
    }

    @Override
    public void undo() {
        System.out.println("Undo delete command from " + this.DataSource);
    }
}
