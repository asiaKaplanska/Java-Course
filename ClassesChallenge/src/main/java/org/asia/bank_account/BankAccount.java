package org.asia.bank_account;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // Empty constructor
    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    // Constructor with parameters
    public BankAccount(int accountNumber, double balance, String customerName,
                       String email, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
        // this.customerName = customerName;
        // this.email = email;
        //  this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposite(double amount) {
        balance += amount;
        System.out.println("Current account balance after deposit is equal $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdraw funds is not allowed, because balance can't be negative");
            return;
        }

        balance -= amount;
        System.out.println("Current account balance after withdrawal is equal $" + balance );
    }
}
