package adapter;

import java.util.List;

/**
 * @ClassName LogFileManagerImpl
 * @Description
 * @Author 25127
 * @Date 2020/5/5 5:08 下午
 * @Email jie.wang13@hand-china.com
 **/
public class LogFileManagerImpl implements LogFileManager {
    private String fileName;

    public LogFileManagerImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Log> readLog() {
        return null;
    }

    @Override
    public void writeLogIntoFile(List<Log> log) {

    }
}
