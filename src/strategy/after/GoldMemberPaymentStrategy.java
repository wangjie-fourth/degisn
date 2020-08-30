package strategy.after;

public class GoldMemberPaymentStrategy extends AbstractPaymentStrategy{
    @Override
    public boolean canProcess(Context context) {
        return UserType.GOLD.name().equals(context.getUserType());
    }

    @Override
    protected double doGetTotalAmount(Context context) {
        return context.getRawPrice();
    }

}
