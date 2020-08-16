package com.tiven.questy.DebugingAndTesting.JUnit.Challange;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;


public class UtilitiesTest {
    private Utilities utilities;
/*
    private String tested;
    private String expected;*/

    @Before
    public void setup() {
        utilities = new Utilities();
    }

  /*  @Parameterized.Parameters
    public static Collection<String[]> toBeInjected() {
        return Arrays.asList(new String[][]
                {
                        {"AABCDDEFF", "ABCDEF"},
                        {"ABCCABDEEF", "ABCABDEF"},
                        {"ABBCDDEFF", "ABCDEF"},
                        {"AABCADDAEFF", "ABCADAEF"}
                });
    }*/

    @Test
    public void everyNthChar() {
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] output = new char[]{'e', 'l'};

        assertArrayEquals(output, utilities.everyNthChar(input,2));
        assertArrayEquals(input,utilities.everyNthChar(input,10));
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertEquals("ABCDEF", utilities.removePairs("ABBCDDEFF"));
        assertEquals("ABCADAEF", utilities.removePairs("AABCADDAEFF"));
        assertNull("null was not returned", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));

    }

    @Test
    public void converted() {
        assertEquals(300,utilities.converter(10,5));
    }
    @Test(expected = ArithmeticException.class)
    public void converted_dividedByZero() {
        assertEquals(300,utilities.converter(10,0));
    }

    @Test
    public void nullIfOddLenght_odd() {
       assertNull("nie jest nullem",utilities.nullIfOddLength("siema"));
    }
    @Test
    public void nullIfOddLenght_even() {
        assertNotNull("nie jest nullem",utilities.nullIfOddLength("sieman"));
    }
}
