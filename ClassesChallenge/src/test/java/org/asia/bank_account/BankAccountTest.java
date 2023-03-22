package org.asia.bank_account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

    private BankAccount account = new BankAccount();

    @BeforeEach
    void setup() {
       System.out.println("Starting test...");
       account.setBalance(1000.00);
       System.out.println("Account balance is equal " + account.getBalance());
    }

    @Test
    @DisplayName("Should correctly deposit when amount > 0 [positive]")
    void deposite() {
        //when
        account.deposite(120.50);

        //then
        assertEquals(1120.50, account.getBalance(), 0.001);
    }

    @ParameterizedTest
    @DisplayName("Should correctly withdraw when amount <= account balance [positive]")
    @MethodSource("getWithdrawParameters")
    void withdraw(double amount, double expected) {
        //when
        account.withdraw(amount);

        //then
        assertEquals(expected, account.getBalance(), 0.001);
    }

    public static Stream<Arguments> getWithdrawParameters() {
        return Stream.of(
                Arguments.of(100.00, 900.00),
                Arguments.of(200.00, 800.00),
                Arguments.of(325.14, 674.86),
                Arguments.of(489.33, 510.67),
                Arguments.of(1000.00, 0.00));
    }

    @Test
    @DisplayName("Should not withdraw when amount > account balance [negative]")
    void withdrawMoreThanBalance() {
        //when
        account.withdraw(1500);

        //then
        assertEquals(1000, account.getBalance());
    }
}