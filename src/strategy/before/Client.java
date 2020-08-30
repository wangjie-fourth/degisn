package strategy.before;

public class Client {

    public static void main(String[] args) {
        double rawPrice = 100.4;
        String userType = "金牌会员";

        PaymentManager paymentManager = new PaymentRawManagerImpl();
        double calculate = paymentManager.calculate(rawPrice, userType);
        System.out.println("calculate = " + calculate);

    }
}
