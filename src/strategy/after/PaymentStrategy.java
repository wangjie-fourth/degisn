package strategy.after;

import java.util.Objects;

public interface PaymentStrategy {
    /**
     * 为了防止后续方法参数不断膨胀，这里使用上下文对象来存储相关信息
     */
//    boolean canProcess(Context context);

    Context getTotalAmount(Context context);

    /**
     * 这个相当于将多个PaymentStrategy的getTotalAmount组合成一个方法，来嵌套使用了～！！！牛逼
     *
     * @param after
     * @return
     */
    default PaymentStrategy andThen(PaymentStrategy after) {
        Objects.requireNonNull(after);
        return (Context context) -> after.getTotalAmount(getTotalAmount(context));
    }
}
