package factory.simple;

import factory.simple.function.DataReader;
import factory.simple.function.FileDataReader;
import factory.simple.function.MySQLDataReader;

/**
 * @ClassName SimpleFactory
 * @Description
 * @Author 25127
 * @Date 2020/4/9 18:41
 * @Email jie.wang13@hand-china.com
 **/
public class SimpleFactory {
    public DataReader getDataReader(String type){
        switch (type){
            case "MYSQL":
                return new MySQLDataReader();
            case "File":
                return new FileDataReader();
            default:
                return null;
        }
    }
}
