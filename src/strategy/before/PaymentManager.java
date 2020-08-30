package strategy.before;

public interface PaymentManager {
    double calculate(double rawPrice, String userType);
}
