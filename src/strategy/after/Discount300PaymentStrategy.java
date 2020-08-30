package strategy.after;

public class Discount300PaymentStrategy extends AbstractPaymentStrategy{

    private static final int DISCOUNT_NUM = 50;

    @Override
    public boolean canProcess(Context context) {
        return context.getRawPrice() >= 300;
    }

    @Override
    protected double doGetTotalAmount(Context context) {
        return context.getRawPrice() - DISCOUNT_NUM;
    }
}
