package chainOfResponsibility.chainHandler;

public abstract class AbstractChainHandler implements ChainHandler{
    
    private ChainHandler nextHandler;

    public void setNextHandler(ChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(ConfigContext context) {
        if (canProcess(context)) {
            processHandler(context);
        }
        if (nextHandler != null) {
            nextHandler.handle(context);
        }
    }

    protected abstract void processHandler(ConfigContext context);
}
