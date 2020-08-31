package command.processor;

public interface DataSource {
    void insert(String primaryKey) ;

    void update(String primaryKey);

    void delete(String primaryKey);
}
