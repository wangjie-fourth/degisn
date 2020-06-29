package factory.before;

import factory.before.function.DataReader;
import factory.before.function.FileDataReader;
import factory.before.function.MySQLDataReader;

/**
 * @ClassName DataProcessManager
 * @Description
 * @Author 25127
 * @Date 2020/4/9 16:24
 * @Email jie.wang13@hand-china.com
 **/
public class DataProcessManager {

    // 如何解决下面创建FileDataReader、MySQLDataReader写死的代码呢？

    public void processDataFromFile() {
        // get data
        DataReader dataReader = new FileDataReader();
        String data = dataReader.get();

        // processing data
        System.out.println("Data process : " + data);
    }

    public void processDataFromMySQL() {
        // get data
        DataReader dataReader = new MySQLDataReader();
        String data = dataReader.get();

        //processing data
        System.out.println("Data process : " + data);
    }
}
