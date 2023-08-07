package dev.lpa;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String branchName){
        for (var branch : branches) {
            if (branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (findBranch(branchName) != null && printTransactions) {
            System.out.println("Customer details for branch " + branchName);
            int i = 1;
            for (var customer : findBranch(branchName).getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + i + "]");
                System.out.println("Transactions");
                int j = 1;
                for (var transaction : customer.getTransactions()) {
                    System.out.println("[" + j + "]  Amount " + transaction);
                    j++;
                }
                i++;
            }
            return true;
        } else if (findBranch(branchName) != null && !printTransactions) {
            System.out.println("Customer details for branch " + branchName);
            int i = 1;
            for (var customer : findBranch(branchName).getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + i + "]");
                i++;
            }
            return true;
        }
        return false;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String name, double transaction){
        Branch branch = findBranch(branchName);
        if (branch != null ) {
            return branch.newCustomer(name, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }
}
