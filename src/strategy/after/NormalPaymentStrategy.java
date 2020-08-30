package strategy.after;

public class NormalPaymentStrategy  extends AbstractPaymentStrategy{
    @Override
    public boolean canProcess(Context context) {
        return UserType.NOEMAL.name().equals(context.getUserType());
    }

    @Override
    protected double doGetTotalAmount(Context context) {
        return context.getRawPrice();
    }

}
