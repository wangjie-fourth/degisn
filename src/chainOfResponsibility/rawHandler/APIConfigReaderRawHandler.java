package chainOfResponsibility.rawHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class APIConfigReaderRawHandler implements RawHandler{
    private static final String KEY_FROM_API = "KEY_FROM_API";


    @Override
    public void handle(ConfigContext configContext) {
        log.info("The config request is handled by APIConfigReaderRawHandler");
        String value = loadFromApi();
        configContext.getConfigs().put(KEY_FROM_API, value);
    }

    private String loadFromApi() {
        return "api-config";
    }
}
