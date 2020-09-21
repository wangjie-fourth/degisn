package interpreter.after;

import interpreter.basic.Product;

public class NotSpec extends Spec{

    private Spec spec;

    public NotSpec(Spec spec) {
        this.spec = spec;
    }

    @Override
    boolean isSatisfiedBy(Product product) {
        return !spec.isSatisfiedBy(product);
    }
}
