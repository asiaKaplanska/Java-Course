package org.asia.bank_account;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(12345, 5000.00, "Asia Ka",
                "asia@ka.com", 123456789);

        bankAccount.deposite(35.50);
        bankAccount.withdraw(2000.00);
        bankAccount.withdraw(35.50);
        bankAccount.withdraw(1500.00);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com",12345);
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() +
                "; name " + timsAccount.getCustomerName());

    }
}
