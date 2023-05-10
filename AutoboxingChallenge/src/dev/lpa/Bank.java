package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {

       if (customers.stream().noneMatch(c -> c.getiD() == customer.getiD())) {
           customers.add(customer);
       } else {
           System.out.println("""
                   This customer already exist!!!
                   Add another customer...""");
       }
    }

    public void addTransaction(int customerID, Double transaction) {

        for (Customer c : customers) {
            if (c.getiD() == customerID) {
                c.addTransaction(transaction);
                return;
            }
        }
        System.out.println("Customer not found!");
    }

    public void printStatement(int customerID) {

        for (Customer c : customers) {
            if (c.getiD() == customerID) {
                System.out.println("Customer name: " + c.getName() +
                        ", transactions: ");
                c.printTransactions();
                return;
            }
        }
        System.out.println("Customer not found!");
    }



}
