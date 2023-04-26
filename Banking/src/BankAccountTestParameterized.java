public class BankAccountTestParameterized {

    private BankAccount account;

    @org.junit.jupiter.api.BeforeEach
    void setup() {
        account = new BankAccount("Asius", "Ka", 1000.00, BankAccount.CHEKING);
        System.out.println("Running a test....");
    }
}
