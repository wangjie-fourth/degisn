package strategy.after;

public class Discount100PaymentStrategy extends AbstractPaymentStrategy{

    private static final int DISCOUNT_NUM = 10;

    @Override
    public boolean canProcess(Context context) {
        double rawPrice = context.getRawPrice();
        return rawPrice >= 100 && rawPrice < 300;
    }

    @Override
    protected double doGetTotalAmount(Context context) {
        return context.getRawPrice() - DISCOUNT_NUM;
    }
}
