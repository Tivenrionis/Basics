package com.tiven.questy.DebugingAndTesting.JUnit;

import org.junit.*;

import static junit.framework.TestCase.*;


public class BankAccountTest4 {
    private BankAccount account;
    private static int count;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Runs only once ?:: Count = " + count++);
    }

    //Za kazdym testem sie wykona
    @Before
    public void setup() {
        account = new BankAccount("Michal", "Wesolowski", 1000.0, BankAccount.Type.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    public void deposit() {
        double balance = account.deposit(200.0, true);
        assertEquals(1200, balance, 0);
    }

    @Test
    public void withdraw_branch() {
        double balance = account.withdraw(600, true);
        assertEquals(400.0, balance, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_NotBranch() {
        double balance = account.withdraw(600, false);
        assertEquals(400.0, balance, 0);


    }

    @Test
    public void getBalance_deposit() {
        account.deposit(200.0, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        account.withdraw(200.0, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        assertTrue("The account is NOT a checking account", account.isChecking());
    }

    @After
    public void afterEvery() {
        System.out.println("lol = " + count++);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Once after all:: Count = " + count++);
    }

}