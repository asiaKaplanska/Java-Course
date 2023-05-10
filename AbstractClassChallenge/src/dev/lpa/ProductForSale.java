package dev.lpa;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {

        return quantity * price;
    }

    public void printPricedLineItem(int quantity) {

        System.out.println("Ordered " + quantity + " pcs of " + type +
                " with total cost $" + getSalesPrice(quantity));
    }

    public abstract void showDetails();
}
