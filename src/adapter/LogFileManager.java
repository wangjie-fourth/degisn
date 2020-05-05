package adapter;

import java.util.List;

/**
 * @ClassName LogOperationManager
 * @Description
 * @Author 25127
 * @Date 2020/5/5 1:36 下午
 * @Email jie.wang13@hand-china.com
 **/
public interface LogFileManager {


     List<Log> readLog();

     void writeLogIntoFile(List<Log> log);

}
