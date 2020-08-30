package chainOfResponsibility.rawHandler;

import java.util.HashSet;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        DBConfigReaderRawHandler dbConfigReaderRawHandler = new DBConfigReaderRawHandler();
        CacheConfigReaderRawHandler cacheConfigReaderRawHandler = new CacheConfigReaderRawHandler();
        HardCodeConfigReaderRawHandler hardCodeConfigReaderRawHandler = new HardCodeConfigReaderRawHandler();
        APIConfigReaderRawHandler apiConfigReaderRawHandler = new APIConfigReaderRawHandler();
        ConfigReaderRawHandlerManager manager = new ConfigReaderRawHandlerManager(
                dbConfigReaderRawHandler,
                cacheConfigReaderRawHandler,
                hardCodeConfigReaderRawHandler,
                apiConfigReaderRawHandler
        );

        Set<String> configKeys = new HashSet<>();
        configKeys.add("KEY_FROM_DB");
        configKeys.add("KEY_FROM_CACHE");
        ConfigContext configContext = new ConfigContext(configKeys);

        manager.handlerRequest(configContext);

        System.out.println("configContext = " + configContext);
    }
}
