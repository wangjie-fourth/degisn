package chainOfResponsibility.chainHandler;

import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Slf4j
public class CacheConfigReaderChainHandler extends AbstractChainHandler{

    private static final String KEY_FROM_CACHE = "KEY_FROM_CACHE";

    @Override
    public void processHandler(ConfigContext context) {
        log.info("the config request is handled by CacheConfigReaderChainHandler");
        String value = loadFromCache();
        context.getConfigs().put(KEY_FROM_CACHE, value);
    }

    private String loadFromCache() {
        return "cache-config";
    }

    @Override
    public boolean canProcess(ConfigContext configContext) {
        Set<String> keys = configContext.getKeys();
        return keys.contains(KEY_FROM_CACHE);
    }
}
