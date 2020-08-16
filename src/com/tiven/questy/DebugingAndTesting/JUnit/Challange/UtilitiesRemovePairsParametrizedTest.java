package com.tiven.questy.DebugingAndTesting.JUnit.Challange;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesRemovePairsParametrizedTest {

    private String tested;
    private String expected;

    public UtilitiesRemovePairsParametrizedTest(String tested, String expected) {
        this.tested = tested;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<String[]> toBeInjected() {
        return Arrays.asList(new String[][]
                {
                        {"ABCDEFF", "ABCDEF"},
                        {"AB88EFFG", "AB8EFG"},
                        {"112233445566", "123456"},
                        {"ZYZQQB", "ZYZQB"},
                        {"A", "A"}
                });
    }

    @Test
    public void removePairs() {
        Utilities utilities = new Utilities();
        assertEquals(expected, utilities.removePairs(tested));

    }
}
