package strategy.after;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<PaymentStrategy> paymentStrategies = new ArrayList<>();
        paymentStrategies.add(new NormalPaymentStrategy());
        paymentStrategies.add(new SilverMemberPaymentStrategy());
        paymentStrategies.add(new GoldMemberPaymentStrategy());
        paymentStrategies.add(new Discount100PaymentStrategy());
        paymentStrategies.add(new Discount300PaymentStrategy());

        double rawPrice = 500.4;
        String userType = "NOEMAL";
        Context context = new Context();
        context.setRawPrice(rawPrice);
        context.setUserType(userType);


        NormalPaymentStrategy normalPaymentStrategy = new NormalPaymentStrategy();
        SilverMemberPaymentStrategy silverMemberPaymentStrategy = new SilverMemberPaymentStrategy();
        GoldMemberPaymentStrategy goldMemberPaymentStrategy = new GoldMemberPaymentStrategy();
        Discount100PaymentStrategy discount100PaymentStrategy = new Discount100PaymentStrategy();
        Discount300PaymentStrategy discount300PaymentStrategy = new Discount300PaymentStrategy();

        PaymentStrategy paymentStrategy = normalPaymentStrategy
                .andThen(discount100PaymentStrategy)
                .andThen(discount300PaymentStrategy);

        Context totalAmount = paymentStrategy.getTotalAmount(context);
        System.out.println("totalAmount = " + totalAmount.getTotalAmount());


    }
}
