package command.processor;

public class MySQLDataSource implements DataSource{
    public void insert(String primaryKey) {
        System.out.println("MySQLDataSource Insert data:" + primaryKey);
    }

    public void update(String primaryKey) {
        System.out.println("MySQLDataSource Update: " + primaryKey);
    }

    public void delete(String primaryKey) {
        System.out.println("MySQLDataSource Delete:" + primaryKey);
    }
}
