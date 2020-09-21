package interpreter.after;

import interpreter.basic.Color;
import interpreter.basic.Product;
import interpreter.basic.ProductSize;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFinder {

    private List<Product> productList;

    public ProductFinder(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> bySize(ProductSize size) {
        SizeSpec sizeSpec = new SizeSpec(size);
        return productList.stream()
                .filter(sizeSpec::isSatisfiedBy)
                .collect(Collectors.toList());
    }

    public List<Product> belowPrice(float price) {
        BelowPriceSpec spec = new BelowPriceSpec(price);
        return productList.stream()
                .filter(spec::isSatisfiedBy)
                .collect(Collectors.toList());
    }

    public List<Product> byColorSizeAndBelowPrice(Color color, ProductSize size, float price) {
        ColorSpec colorSpec = new ColorSpec(color);
        SizeSpec sizeSpec = new SizeSpec(size);
        BelowPriceSpec belowPriceSpec = new BelowPriceSpec(price);

        Spec combineSpec = new AndSpec(new AndSpec(colorSpec, sizeSpec), belowPriceSpec);
        return productList.stream()
                .filter(combineSpec::isSatisfiedBy)
                .collect(Collectors.toList());
    }
}
