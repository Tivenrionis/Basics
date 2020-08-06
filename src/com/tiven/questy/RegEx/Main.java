package com.tiven.questy.RegEx;

public class Main {
    public static void main(String[] args) {
        String s = "I am a string. Yes, I am.";
        System.out.println(s);
        String youString = s.replaceAll("I","You");
        System.out.println(youString);

        String alphanumeric = "abcDeeeF12idihiIndgjDOz";
        System.out.println(alphanumeric.replaceAll(".","Y")); /// .   -> any character
        System.out.println(alphanumeric.replaceAll("^abcDee","YYY")); // ^ -> boundry at the beginning with attached

        String alphanumeric2 = "abcDeeeF12idhiabcDeeeIndgjDOz";
        System.out.println(alphanumeric2.replaceAll("^abcDee","YYY"));

        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^Hello"));
        System.out.println(alphanumeric.matches("^abcDeeeF12idhiIndgjDOz"));

        System.out.println(alphanumeric.replaceAll("gjDOz$","The end")); // $ -> boundry at the end with attached
        System.out.println(alphanumeric.replaceAll("[dhi]","Y")); // [] -> if you want to replace a letter or set of letters wszystkie te zostana zastapione
        System.out.println(alphanumeric.replaceAll("[i][dI]","X")); // [1][2] -> zamien 1 jezeli nastepna litera to te z 2

        System.out.println("harry".replaceAll("[Hh]arry","Harry"));

        String newAlphanumeric = "abcDeeeF12idihiIndgjDOz";
        System.out.println(newAlphanumeric.replaceAll("[^ej]","X")); // [^xy] wszystkie litery ktore nie sa xy
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]","X")); // uproszczenie na dole
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]","X")); // mozna robic od do range
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X")); // (?i) turn off case sensitiveness works only for ASCII... for  Unicode (?iu)
        System.out.println(newAlphanumeric.replaceAll("[0-9]","X"));
        System.out.println(newAlphanumeric.replaceAll("\\d","X")); // zamienia wszystkie cyfry
        System.out.println(newAlphanumeric.replaceAll("\\D","X")); // zamienia wszystkie litery nie bedace cyfra

        String hasWhitespace = "I have blanks and\t a tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", "")); // zastepuje spacje
        System.out.println(hasWhitespace.replaceAll("\t","X")); // zmienia tab
        System.out.println(hasWhitespace.replaceAll("\\S","X")); // non whitespace character
        System.out.println(newAlphanumeric.replaceAll("\\w","X")); // a-z0-9_ lower and upper cased
        System.out.println(hasWhitespace.replaceAll("\\W","X")); // wszystkie oprócz a-z0-9 lower and upper cased
        System.out.println(hasWhitespace.replaceAll("\\b","X")); // kazde slowo oznacocze jest po obu stronach X ... dobre przy html tagach
    }
}
