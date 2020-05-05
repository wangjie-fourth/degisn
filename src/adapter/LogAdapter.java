package adapter;

import java.util.List;

/**
 * @ClassName LogAdapter
 * @Description
 * @Author 25127
 * @Date 2020/5/5 5:10 下午
 * @Email jie.wang13@hand-china.com
 **/
public class LogAdapter implements LogDAO {
    private LogFileManager adaptee;

    public LogAdapter(LogFileManager adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(Log log) {
        List<Log> list = adaptee.readLog();
        list.add(log);
        adaptee.writeLogIntoFile(list);

        // db operation

    }
}
