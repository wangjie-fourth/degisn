package interpreter.after;

import interpreter.basic.Product;

public abstract class Spec {
    abstract boolean isSatisfiedBy(Product product);
}
