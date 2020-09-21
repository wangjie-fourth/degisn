package interpreter.basic;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private String sku;
    private String name;
    private Color color;
    private ProductSize size;
    private float price;
}
