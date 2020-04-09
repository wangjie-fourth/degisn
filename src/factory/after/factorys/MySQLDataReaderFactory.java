package factory.after.factorys;

import factory.after.function.DataReader;
import factory.after.function.MySQLDataReader;

/**
 * @ClassName MySQLDataReaderFactory
 * @Description
 * @Author 25127
 * @Date 2020/4/9 17:32
 * @Email jie.wang13@hand-china.com
 **/
public class MySQLDataReaderFactory implements DataReaderFactory{

    @Override
    public DataReader createDataReader() {
        return new MySQLDataReader();
    }
}
