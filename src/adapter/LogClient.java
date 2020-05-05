package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LogClient
 * @Description
 * @Author 25127
 * @Date 2020/5/5 5:14 下午
 * @Email jie.wang13@hand-china.com
 **/
public class LogClient {

    public static void main(String[] args) {
        Log log = new Log();
        log.setLogId("1");
        log.setUserId("mi");
        List<Log> list = new ArrayList<>();
        LogFileManager logFile = new LogFileManagerImpl("filename");

        LogDAO logDAO = new LogAdapter(logFile);
        logDAO.createLog(log);



    }
}
