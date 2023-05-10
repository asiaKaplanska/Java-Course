package dev.lpa;

public class ChalkBag extends ProductForSale {
    public ChalkBag(double price, String description) {
        super("chalk bag", price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type + "'s cost equals $" + price + " " + description);
    }
}
