package command.processor;

import java.util.ArrayList;
import java.util.List;

public class DataProcessClient {
    public static void main(String[] args) {
        OracleDataSource oracleDataSource = new OracleDataSource();
        MySQLDataSource mySQLDataSource = new MySQLDataSource();

        DataProcessorManager manager = new DataProcessorManager();

        List<Command> commandList = new ArrayList<>();

        Command command = new InsertCommand("key_1");
        ((InsertCommand) command).setDataSource(oracleDataSource);

        Command command2 = new DeleteCommand("key_2");
        ((DeleteCommand) command2).setDataSource(oracleDataSource);

        Command command3 = new UpdateCommand("key_3");
        ((UpdateCommand) command3).setDataSource(mySQLDataSource);

        commandList.add(command);
        commandList.add(command2);
        commandList.add(command3);

        manager.execute(commandList);
        manager.uodo(commandList);

    }
}
