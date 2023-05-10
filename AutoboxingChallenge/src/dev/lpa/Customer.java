package dev.lpa;

import java.util.ArrayList;

public class Customer {
    private int iD;
    private String name;
    private ArrayList<Double> transactions;

    public Customer(int iD, String name) {
        this.iD = iD;
        this.name = name;
        transactions = new ArrayList<>();
    }

    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Double transaction) {

        transactions.add(transaction);
    }

    public void printTransactions() {

        int number = 1;
        for (Double d : transactions) {
            System.out.println(number + ". transaction: " + d);
            number++;
        }
    }
}
