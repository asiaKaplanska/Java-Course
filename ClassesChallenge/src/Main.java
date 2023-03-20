public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.getBalance();
        bankAccount.setBalance(1500.00);
        bankAccount.deposite(35.50);
        bankAccount.withdraw(2000.00);
        bankAccount.withdraw(35.50);
        bankAccount.withdraw(1500.00);

    }
}
