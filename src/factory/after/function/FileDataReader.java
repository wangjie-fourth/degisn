package factory.after.function;

/**
 * @ClassName FileDataReader
 * @Description
 * @Author 25127
 * @Date 2020/4/9 16:35
 * @Email jie.wang13@hand-china.com
 **/
public class FileDataReader implements DataReader {
    @Override
    public String get() {
        return "File Data!";
    }
}
