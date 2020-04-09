package factory.after.factorys;

import factory.after.function.DataReader;
import factory.after.function.FileDataReader;

/**
 * @ClassName FileDataReaderFactory
 * @Description
 * @Author 25127
 * @Date 2020/4/9 17:32
 * @Email jie.wang13@hand-china.com
 **/
public class FileDataReaderFactory implements DataReaderFactory {
    @Override
    public DataReader createDataReader() {
        return new FileDataReader();
    }
}
