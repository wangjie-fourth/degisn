package interpreter.after;

import interpreter.basic.Product;
import interpreter.basic.ProductSize;

public class SizeSpec extends Spec{
    private ProductSize size;

    public SizeSpec(ProductSize size) {
        this.size = size;
    }

    public ProductSize getSize() {
        return size;
    }

    public boolean isSatisfiedBy(Product product) {
        return size.equals(product.getSize());
    }
}
