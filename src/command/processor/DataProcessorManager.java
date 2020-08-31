package command.processor;

import java.util.List;

public class DataProcessorManager {

    public void execute(List<Command> commandList) {
        commandList.forEach(Command::execute);
    }

    public void uodo(List<Command> commandList) {
        for (int i = commandList.size(); i > 0; i--) {
            commandList.get(i-1).undo();
        }
    }
}
