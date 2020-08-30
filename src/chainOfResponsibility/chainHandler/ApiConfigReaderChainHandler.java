package chainOfResponsibility.chainHandler;

import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Slf4j
public class ApiConfigReaderChainHandler extends AbstractChainHandler{

    private static final String KEY_FROM_API = "KEY_FROM_API";


    @Override
    protected void processHandler(ConfigContext context) {
        log.info("the config request is handled by APIConfigReaderChainHandler");
        String value = loadFromAPI();
        context.getConfigs().put(KEY_FROM_API, value);
    }

    private String loadFromAPI() {
        return "api-config";
    }

    @Override
    public boolean canProcess(ConfigContext configContext) {
        Set<String> keys = configContext.getKeys();
        return keys.contains(KEY_FROM_API);
    }
}
