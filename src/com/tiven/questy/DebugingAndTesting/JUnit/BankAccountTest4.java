package com.tiven.questy.DebugingAndTesting.JUnit;

import org.junit.Test;

import static junit.framework.TestCase.*;


public class BankAccountTest4 {

    @Test
    public void deposit() {
        BankAccount account = new BankAccount("Michal", "Wesolowski", 1000.0, BankAccount.CHECKING);
        double balance = account.deposit(200.0, true);
        assertEquals(1200, balance, 0);
    }

    @Test
    public void withdraw() {

        fail("This test has yet to be implemented");
    }

    @Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Michal", "Wesolowski", 1000.0, BankAccount.CHECKING);
        account.deposit(200.0, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Michal", "Wesolowski", 1000.0, BankAccount.CHECKING);
        account.withdraw(200.0, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Michal", "Wesolowski", 1000.0, BankAccount.CHECKING);
        assertTrue("The account is NOT a checking account",account.isChecking());
    }

}