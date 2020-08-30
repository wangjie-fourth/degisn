package chainOfResponsibility.rawHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBConfigReaderRawHandler implements RawHandler{

    private static final String KEY_FROM_DB = "KEY_FROM_DB";

    @Override
    public void handle(ConfigContext configContext) {
        log.info("the config request is handled by DBConfigReaderRawHandler");
        String value = loadFromDB();
        configContext.getConfigs().put(KEY_FROM_DB, value);
    }

    private String loadFromDB() {
        return "db-config";
    }
}
