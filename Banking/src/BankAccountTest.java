import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.jupiter.api.BeforeAll
    static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.jupiter.api.BeforeEach
    void setup() {
        account = new BankAccount("Asius", "Ka", 1000.00, BankAccount.CHEKING);
        System.out.println("Running a test...");
    }

    @org.junit.jupiter.api.Test
    void deposite() {
        BankAccount account = new BankAccount("Asius", "Ka", 1000.00, BankAccount.CHEKING);
        double balance = account.deposite(200.00, true);
        assertEquals(1200, balance, 0);
    }
    @org.junit.jupiter.api.Test
    void withdraw_branch() {
        double balance = account.withdraw(600, true);
        assertEquals(400.00, balance, 0);
    }


    @ParameterizedTest
    @MethodSource("provideBalanceDeposite")
    void deposite_parameterized(double amount, boolean branch, double expected) {
        double balance = account.deposite(amount, branch);
        assertEquals(expected, balance, 0.01);
    }

    public static Collection<Object[]> provideBalanceDeposite() {
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.00, true, 2000.00}
        });

    }

    @org.junit.jupiter.api.Test
    void withdaw_notBranch() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(600.00, false));
        assertEquals(1000.00, account.getBalance(), 0);
    }


    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        account.deposite(200.00, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() {
        //assertEquals(true, account.isChecking());
        assertTrue(account.isChecking());

    }

    @org.junit.jupiter.api.AfterAll
    static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.jupiter.api.AfterEach
    void teardown() {
        System.out.println("Count = " + count++);
    }
}