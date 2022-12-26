package product;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private int coint;

    public Product(String name, int price, int coint) {
        setName(name);
        setPrice(price);
        setCoint(coint);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if( name==null||name.isEmpty()){
                throw new IllegalArgumentException("Заполните карточку обьекта");}
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку продукта");
        }
        this.price = price;
    }

    public int getCoint() {
        return coint;
    }

    public void setCoint(int coint) {
        if (coint <= 0) {
            throw new IllegalArgumentException("Заполните карточку продукта");
        }
        this.coint = coint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
