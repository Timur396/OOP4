package product;

import java.util.HashSet;
import java.util.Set;

public class ProductList {

    private Set<Product> products = new HashSet<>();

    public ProductList(Set<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть");
        }
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

}

