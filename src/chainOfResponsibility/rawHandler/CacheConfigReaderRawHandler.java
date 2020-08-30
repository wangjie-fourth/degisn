package chainOfResponsibility.rawHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CacheConfigReaderRawHandler implements RawHandler{

    private static final String KEY_FROM_CACHE = "KEY_FROM_CACHE";

    @Override
    public void handle(ConfigContext configContext) {
        log.info("The config request is handled by CacheConfigReaderRawHandler");
        String value = loadFromCache();
        configContext.getConfigs().put(KEY_FROM_CACHE, value);
    }

    private String loadFromCache() {
        return "cache-config";
    }
}
