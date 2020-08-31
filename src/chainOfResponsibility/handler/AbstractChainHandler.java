package chainOfResponsibility.handler;


public abstract class AbstractChainHandler implements Handler{


    @Override
    public ConfigContext handle(ConfigContext context) {
        if (canProcess(context)) {
            processHandler(context);
        }
        return context;
    }

    protected abstract boolean canProcess(ConfigContext context);

    protected abstract void processHandler(ConfigContext context);
}
