package strategy.after;

/**
 * 为了实现多纬度策略可以链式调用，所以PaymentStrategy只能有一个接口
 * 这里将其他抽象方法放到这里实现
 * 【这个之前还真没了解过】
 *
 * 这个是不是可以用在OnlyOne上面的处理上？？？
 */
public abstract class AbstractPaymentStrategy implements PaymentStrategy{

    protected abstract boolean canProcess(Context context);
    protected abstract double doGetTotalAmount(Context context);


    @Override
    public Context getTotalAmount(Context context) {
        if (!canProcess(context)) {
            return context;
        }
        double totalAmount = doGetTotalAmount(context);
        context.setTotalAmount(totalAmount);
        return context;
    }


}
