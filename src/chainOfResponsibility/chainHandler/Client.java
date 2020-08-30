package chainOfResponsibility.chainHandler;


import java.util.HashSet;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        ChainHandler apiConfigReaderChainHandler = new ApiConfigReaderChainHandler();
        ChainHandler cacheConfigReaderRawHandler = new CacheConfigReaderChainHandler();

        ((ApiConfigReaderChainHandler)apiConfigReaderChainHandler)
                .setNextHandler(cacheConfigReaderRawHandler);

        Set<String> configKeys = new HashSet<>();
        configKeys.add("KEY_FROM_CACHE");
        configKeys.add("KEY_FROM_API");
        ConfigContext configContext = new ConfigContext(configKeys);

        apiConfigReaderChainHandler.handle(configContext);
        System.out.println("configContext = " + configContext);
    }
}
