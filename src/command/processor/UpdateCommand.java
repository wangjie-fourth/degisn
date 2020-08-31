package command.processor;

public class UpdateCommand extends AbstractCommand{
    public UpdateCommand(String primaryKey) {
        super(primaryKey);
    }

    @Override
    public void execute() {
        this.DataSource.update(this.primaryKey);
    }

    @Override
    public void undo() {
        System.out.println("Undo update command from " + this.DataSource);
    }
}
