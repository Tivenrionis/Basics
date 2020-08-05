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
    }
}
