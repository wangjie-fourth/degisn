package chainOfResponsibility.handler;

import java.util.HashSet;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        Handler apiConfig = new ApiConfigReaderChainHandler();
        Handler cacheConfig = new CacheConfigReaderChainHandler();

        Handler chainHandler = apiConfig.andThen(cacheConfig);

        Set<String> configKeys = new HashSet<>();
        configKeys.add("KEY_FROM_DB");
        configKeys.add("KEY_FROM_CACHE");
        ConfigContext configContext = new ConfigContext(configKeys);

        chainHandler.handle(configContext);

        System.out.println("configContext = " + configContext);
    }
}
