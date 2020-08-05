package com.tiven.questy.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> bingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71"
        );
        // Wypisz wszystkie wartosci w kolumnie G
        //1. Iterowac po liscie i wypisac
        //2.Uzyc Lambda forEach
        //3.Uzyc Streamow

//        Predicate<String> startsWithG = number -> number.startsWith("G");
//
//        bingoNumbers.forEach(number -> System.out.println(startsWithG.test(number)));


        List<String> gNumbers = new ArrayList<>();

        bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .forEach(System.out::println);


// Mozna to ogarnac  wjednej lini
/*        bingoNumbers.forEach(number -> {
            if (number.toUpperCase().startsWith("G")) {
                gNumbers.add(number);
                // System.out.println(number);
            }
        });

        gNumbers.sort((s1, s2) -> s1.compareTo(s2));
        gNumbers.forEach(bingoNumber -> System.out.println(bingoNumber));*/
    }
}
