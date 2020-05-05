package adapter;

/**
 * @ClassName Log
 * @Description
 * @Author 25127
 * @Date 2020/5/5 1:27 下午
 * @Email jie.wang13@hand-china.com
 **/
public class Log {
    private String logId;
    private String userId;
    private String timeStamp;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
