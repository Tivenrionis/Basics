package com.tiven.questy.DebugingAndTesting.JUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParametrized {
    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void setup() {
        account = new BankAccount("Julia", "Wes", 1000.0, BankAccount.Type.CHECKING);
        System.out.println("Running a test..");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]
                {
                        {100.00, true, 1100},
                        {200.00, true, 1200},
                        {325.14, true, 1325.14},
                        {489.33, true, 1489.33},
                        {1000.00, true, 2000.00}
                });
    }

    @Test
    public void getBalance_deposit() {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), .01);
    }
}
