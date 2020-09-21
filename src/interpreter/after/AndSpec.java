package interpreter.after;

import interpreter.basic.Product;

public class AndSpec extends Spec{

    private Spec addend;

    private Spec augend;

    public AndSpec(Spec addend, Spec augend) {
        this.addend = addend;
        this.augend = augend;
    }

    @Override
    boolean isSatisfiedBy(Product product) {
        return addend.isSatisfiedBy(product)
                && augend.isSatisfiedBy(product);
    }
}
