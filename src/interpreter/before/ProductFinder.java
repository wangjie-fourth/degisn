package interpreter.before;

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

    public List<Product> byColor(Color color) {
        return productList.stream()
                .filter(product -> color.equals(product.getColor()))
                .collect(Collectors.toList());
    }

    public List<Product> bySize(ProductSize size) {
        return productList.stream()
                .filter(product -> size.equals(product.getSize()))
                .collect(Collectors.toList());
    }

    public List<Product> byPrice(float price) {
        return productList.stream()
                .filter(product -> price == product.getPrice())
                .collect(Collectors.toList());
    }

    public List<Product> belowPrice(float price) {
        return productList.stream()
                .filter(product -> price < product.getPrice())
                .collect(Collectors.toList());
    }

    public List<Product> byColorSizeAndBelowPrice(Color color, ProductSize size, float price) {
        return productList.stream()
                .filter(product -> price < product.getPrice()
                    && size.equals(product.getSize())
                    && color.equals(product.getColor()))
                .collect(Collectors.toList());
    }
}
