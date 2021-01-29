package s16_IO_binaryFile_serialization.bai_tap_manageProduct;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    private int id;
    private String nameProduct;
    private String price;
    private String description;

    public Product() {
    }

    public Product(int id, String nameProduct, String price, String description) {
        this.id = atomicInteger.incrementAndGet();
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
    }

    public static AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id: " + id +
                ", nameProduct: " + nameProduct + '\'' +
                ", price: " + price + '\'' +
                ", description: " + description;
    }
}
