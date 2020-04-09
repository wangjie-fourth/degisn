package factory.after;

import factory.after.function.DataReader;
import factory.after.function.FileDataReader;
import factory.after.function.MySQLDataReader;


/**
 * @ClassName DataProcessManager
 * @Description
 * @Author 25127
 * @Date 2020/4/9 16:35
 * @Email jie.wang13@hand-china.com
 **/
public class DataProcessManager {

    public void processData(DataReader dataReader) {
        String data = dataReader.get();

        // processing data
        System.out.println("Data process : " + data);
    }

    @Deprecated
    public void processDataFromFile() {
        // get data
        DataReader dataReader = new FileDataReader();
        String data = dataReader.get();

        // processing data
        System.out.println("Data process : " + data);
    }

    @Deprecated
    public void processDataFromMySQL() {
        // get data
        DataReader dataReader = new MySQLDataReader();
        String data = dataReader.get();

        //processing data
        System.out.println("Data process : " + data);
    }
}
