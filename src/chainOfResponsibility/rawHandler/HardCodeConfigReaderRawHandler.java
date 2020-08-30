package chainOfResponsibility.rawHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HardCodeConfigReaderRawHandler implements RawHandler{

    private static final String KEY_FROM_HARD_CODE = "KEY_FROM_HARD_CODE";

    @Override
    public void handle(ConfigContext configContext) {
        log.info("The config request is handled by HardCodeConfigReaderRawHandler");
        String value = loadFromCache();
        configContext.getConfigs().put(KEY_FROM_HARD_CODE, value);
    }

    private String loadFromCache() {
        return "hardcode-config";
    }
}
