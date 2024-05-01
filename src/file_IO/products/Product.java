package file_IO.products;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String productName;
    private double price;
    private String productCategpry;

    public Product(String productName, double price, String productCategpry) {
        this.productName = productName;
        this.price = price;
        this.productCategpry = productCategpry;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductCategpry(String productCategpry) {
        this.productCategpry = productCategpry;
    }

    public String getProductCategpry() {
        return productCategpry;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productCategpry='" + productCategpry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(getPrice(), product.getPrice()) == 0 && Objects.equals(getProductName(), product.getProductName()) && Objects.equals(getProductCategpry(), product.getProductCategpry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getPrice(), getProductCategpry());
    }
}
