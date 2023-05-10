package dev.lpa;

import java.util.ArrayList;

public class Store {

    static ArrayList<OrderItem> orderItems = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<ProductForSale> productForSales = new ArrayList<>();

        productForSales.add(new ChalkBag(25.50, "pinky"));
        productForSales.add(new Quickdraw("light quickdraw", 50, "black diamond's product"));

        for (ProductForSale product : productForSales) {
            product.showDetails();
        }

        addItemToOrder(productForSales.get(0));
        addItemToOrder(productForSales.get(1));

        printOrderedItems();
    }

    public static void addItemToOrder(ProductForSale product) {

        for (OrderItem orderItem : orderItems) {
           if (orderItem.getProduct() == product) {
               orderItem.setQuantity(orderItem.getQuantity() + 1);
               return;
           }
        }
        orderItems.add(new OrderItem(1, product));
    }

    public static void printOrderedItems() {

        for (OrderItem orderItem : orderItems) {
            System.out.println("Item: " + orderItem.getProduct().type + ", cost: $" + orderItem.getProduct().price);
        }
    }

}