import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    private BankAccount account = new BankAccount();

    @org.junit.jupiter.api.BeforeEach
    void setup() {
       System.out.println("Starting test...");
       account.setBalance(1000.00);
       System.out.println("Account balance is equal " + account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void deposite() {
        account.deposite(120.50);
        assertEquals(1120.50, account.getBalance(), 0.001);
    }

    @ParameterizedTest
    @MethodSource("getWithdrawParameters")
    void withdraw(double amount, double expected) {
        account.withdraw(amount);
        assertEquals(expected, account.getBalance(), 0.001);
    }

    public static Collection<Object[]> getWithdrawParameters() {
        return Arrays.asList(new Object[][]{
                {100.00, 900.00},
                {200.00, 800.00},
                {325.14, 674.86},
                {489.33, 510.67},
                {1000.00, 0.00}
        });
    }

    @org.junit.jupiter.api.Test
    void withdraw_moreThanBalance() {
        account.withdraw(1500);
        assertEquals(1000, account.getBalance());
    }
}