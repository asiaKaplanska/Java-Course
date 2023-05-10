package dev.lpa;

public class OrderItem {
    private int quantity;
    private ProductForSale product;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductForSale getProduct() {
        return product;
    }

    public OrderItem(int quantity, ProductForSale product) {
        this.quantity = quantity;
        this.product = product;
    }
}
