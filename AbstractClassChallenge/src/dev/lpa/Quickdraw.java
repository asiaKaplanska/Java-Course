package dev.lpa;

public class Quickdraw extends ProductForSale{

    public Quickdraw(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type + "'s cost equals $" + price + " " + description);

    }
}
