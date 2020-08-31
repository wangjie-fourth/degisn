package command.processor;

public class OracleDataSource implements DataSource{

    public void insert(String primaryKey) {
        System.out.println("Insert data:" + primaryKey);
    }

    public void update(String primaryKey) {
        System.out.println("Update: " + primaryKey);
    }

    public void delete(String primaryKey) {
        System.out.println("Delete:" + primaryKey);
    }
}
