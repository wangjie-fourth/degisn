package strategy.after;

public class SilverMemberPaymentStrategy  extends AbstractPaymentStrategy{
    @Override
    public boolean canProcess(Context context) {
        return UserType.SILVER.name().equals(context.getUserType());
    }

    @Override
    protected double doGetTotalAmount(Context context) {
        return context.getRawPrice() * 0.9;
    }
}
