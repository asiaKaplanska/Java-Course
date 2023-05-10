package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Customer Radek = new Customer(1, "Radek");
        Customer Asia = new Customer(2, "Asia");

        Bank bank = new Bank("Hajsy");
        bank.addCustomer(Radek);
        bank.addCustomer(Asia);
        bank.addCustomer(Radek);

        bank.addTransaction(1, 500.00);
        bank.printStatement(1);
    }
}
