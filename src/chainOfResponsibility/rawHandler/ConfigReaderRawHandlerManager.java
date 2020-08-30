package chainOfResponsibility.rawHandler;

import java.util.Set;

public class ConfigReaderRawHandlerManager {

    private static final String KEY_FROM_DB = "KEY_FROM_DB";
    private static final String KEY_FROM_CACHE = "KEY_FROM_CACHE";
    private static final String KEY_FROM_HARD_CODE = "KEY_FROM_HARD_CODE";
    private static final String KEY_FROM_API = "KEY_FROM_API";

    private final DBConfigReaderRawHandler dbConfigReaderRawHandler;
    private final CacheConfigReaderRawHandler cacheConfigReaderRawHandler;
    private final HardCodeConfigReaderRawHandler hardCodeConfigReaderRawHandler;
    private final APIConfigReaderRawHandler apiConfigReaderRawHandler;

    public ConfigReaderRawHandlerManager(DBConfigReaderRawHandler dbConfigReaderRawHandler,
                                         CacheConfigReaderRawHandler cacheConfigReaderRawHandler,
                                         HardCodeConfigReaderRawHandler hardCodeConfigReaderRawHandler,
                                         APIConfigReaderRawHandler apiConfigReaderRawHandler) {
        this.dbConfigReaderRawHandler = dbConfigReaderRawHandler;
        this.cacheConfigReaderRawHandler = cacheConfigReaderRawHandler;
        this.hardCodeConfigReaderRawHandler = hardCodeConfigReaderRawHandler;
        this.apiConfigReaderRawHandler = apiConfigReaderRawHandler;
    }

    public void handlerRequest(ConfigContext configContext) {
        Set<String> keys = configContext.getKeys();
        if (keys.contains(KEY_FROM_DB)) {
            dbConfigReaderRawHandler.handle(configContext);
        }
        if (keys.contains(KEY_FROM_CACHE)) {
            cacheConfigReaderRawHandler.handle(configContext);
        }
        if (keys.contains(KEY_FROM_HARD_CODE)) {
            hardCodeConfigReaderRawHandler.handle(configContext);
        }
        if (keys.contains(KEY_FROM_API)) {
            apiConfigReaderRawHandler.handle(configContext);
        }
    }
}
