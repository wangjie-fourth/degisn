package chainOfResponsibility.chainHandler;


public interface ChainHandler {

    void handle(ConfigContext context);

    boolean canProcess(ConfigContext configContext);
}
