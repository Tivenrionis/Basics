package com.tiven.questy.LambdaExpressions.Challanges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        new Thread(runnable).start();

        Function<String, String> everySecondChar = s -> {
            StringBuilder returnVal = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondChar.apply("1234567890"));
        System.out.println(everySecondCHar(everySecondChar, "1234567890"));

        Supplier<String> luv = () -> "I love Java!";
        String iLoveJava = luv.get();
        System.out.println(iLoveJava);

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "olivier",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        Function<String, String> firstToUpper = s -> {
            char firstLetter = s.charAt(0);
            String theRest = s.substring(1);

            return String.valueOf(firstLetter).toUpperCase() + theRest;
        };

        System.out.println(topNames2015
                .stream()
                .map(firstToUpper)
                .peek(System.out::println)
                .filter(s->s.startsWith("A"))
                .count());
    }
    private static String everySecondCHar(Function<String, String> function, String testValue) {
        return function.apply(testValue);
    }

}



