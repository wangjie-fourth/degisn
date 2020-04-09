package factory.after;

import factory.after.factorys.DataReaderFactory;
import factory.after.factorys.MySQLDataReaderFactory;

/**
 * @ClassName Main
 * @Description
 * @Author 25127
 * @Date 2020/4/9 17:57
 * @Email jie.wang13@hand-china.com
 **/
public class Main {
    public static void main(String[] args) {
        DataReaderFactory factory = new MySQLDataReaderFactory();
        new DataProcessManager().processData(factory.createDataReader());
    }
}
