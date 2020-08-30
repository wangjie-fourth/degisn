package chainOfResponsibility.rawHandler;

public interface RawHandler {

    /**
     * Handle the config request
     * @param configContext config context
     */
    void handle(ConfigContext configContext);
}
