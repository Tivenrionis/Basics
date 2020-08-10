package com.tiven.questy.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "I am a string. Yes, I am.";
        System.out.println(s);
        String youString = s.replaceAll("I", "You");
        System.out.println(youString);

        String alphanumeric = "abcDeeeF12idihiIndgjDOz";
        System.out.println(alphanumeric.replaceAll(".", "Y")); /// .   -> any character
        System.out.println(alphanumeric.replaceAll("^abcDee", "YYY")); // ^ -> boundry at the beginning with attached

        String alphanumeric2 = "abcDeeeF12idhiabcDeeeIndgjDOz";
        System.out.println(alphanumeric2.replaceAll("^abcDee", "YYY"));

        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^Hello"));
        System.out.println(alphanumeric.matches("^abcDeeeF12idhiIndgjDOz"));

        System.out.println(alphanumeric.replaceAll("gjDOz$", "The end")); // $ -> boundry at the end with attached
        System.out.println(alphanumeric.replaceAll("[dhi]", "Y")); // [] -> if you want to replace a letter or set of letters wszystkie te zostana zastapione
        System.out.println(alphanumeric.replaceAll("[i][dI]", "X")); // [1][2] -> zamien 1 jezeli nastepna litera to te z 2

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12idihiIndgjDOz";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X")); // [^xy] wszystkie litery ktore nie sa xy
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X")); // uproszczenie na dole
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X")); // mozna robic od do range
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X")); // (?i) turn off case sensitiveness works only for ASCII... for  Unicode (?iu)
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X")); // zamienia wszystkie cyfry
        System.out.println(newAlphanumeric.replaceAll("\\D", "X")); // zamienia wszystkie litery nie bedace cyfra

        String hasWhitespace = "I have blanks and\t a tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", "")); // zastepuje spacje
        System.out.println(hasWhitespace.replaceAll("\t", "X")); // zmienia tab
        System.out.println(hasWhitespace.replaceAll("\\S", "X")); // non whitespace character
        System.out.println(newAlphanumeric.replaceAll("\\w", "X")); // a-z0-9_ lower and upper cased
        System.out.println(hasWhitespace.replaceAll("\\W", "X")); // wszystkie oprócz a-z0-9 lower and upper cased
        System.out.println(hasWhitespace.replaceAll("\\b", "X")); // kazde slowo oznacocze jest po obu stronach X ... dobre przy html tagach


        String thirdAlphanumeric = "abcDeeeFh12idhjjiijhiiiiihiIndghhjDOzhhhij hij hhhj hj  hhi";
        System.out.println(thirdAlphanumeric.replaceAll("^abcDeee", "YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{3}", "YYY")); // x{n} quantifier - ile razy wystepuje dany symbol
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+", "YYY")); // +  nie wazne ile razy wystepuje dany symbol ale wiecej niz 0
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*", "YYY")); // x*  moze byc x ale nie musi
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}", "YYY")); // x{n,m} ma wystepowac n do m razy
        System.out.println(thirdAlphanumeric.replaceAll("h+i*j", "Y")); // h min 1 raz obok i ale nie musi oraz j obok    hhhij hij hhhj hj

        StringBuilder htmlText = new StringBuilder("<h1>My Header </h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is paragraph about something</p>");
        htmlText.append("<p>This is another paragtraph</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "<h2>";
        //  String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        //  Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // albo mozna zrobic regexp
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        matcher.reset(); // resetuje wewnetrzny stan matchera ktory ustawil sie gdy zNALAZL ZGODNOSC
        int counter = 0;
        while (matcher.find()) {
            counter++;
            System.out.println("Occurance " + counter + " : " + matcher.start() + " to " + matcher.end());
        }

        // ? means one or zero quantifir=er
        String h2GroupPattern = "(<h2>.*?</h2>)"; // adding ? to a star turning it to the lazy quantifier
        // String h2GroupPattern = "(<h2>.*</h2>)"; // * is greedy quantifier -- grabs as much text as it can
        // String h2GroupPattern = "(<h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurance " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.*?)(</h2>)";
        Pattern groupPattern2 = Pattern.compile(h2TextGroups);
        Matcher groupMatcher2 = groupPattern2.matcher(htmlText);
        while (groupMatcher2.find()) {
            System.out.println("Occurance " + groupMatcher2.group(2));

        }

        // () oznacza grupe
        // AND  OR   NOT
        //"abc" means a and b and c
        //[Hh]arry
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));  // |  -> OR
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        //[^abc]  Not abc
        String tvTest = "tstvtkt";
        //String tNotVRegExp = "t[^v]"; // ostatnie t nie bedzie wypisane bo [^x] oznacza ze nie moze byc X ale cos musi byc po
        String tNotVRegExp = "t(?!v)"; // zeby znalazl ostatnie t --- . ! negacja NOT ... look ahead syntax (?! )  -> negative look ahead
        //t(?=v) -> positive look ahead
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        int count = 0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurance" + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        //REG EXP ARE USED TO VALIDATE USER INPUT OR PATTERN IN THE FILES MAYBE

        // ^([\(]{1}[0-9]{3}[\)]{1}[ ][0-9]{3}[\-][0-9]{4})$
        String phoneOne = "1234567890";
        String phoneTwo = "(123) 456-7890";
        String phoneThree = "123 456-7890";
        String phoneFour = "(123)456-7890";
        System.out.println("Phone1 = "+ phoneOne.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ][0-9]{3}[\\-][0-9]{4})$"));
        System.out.println("Phone2 = "+ phoneTwo.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ][0-9]{3}[\\-][0-9]{4})$"));
        System.out.println("Phone3 = "+ phoneThree.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ][0-9]{3}[\\-][0-9]{4})$"));
        System.out.println("Phone4 = "+ phoneFour.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ][0-9]{3}[\\-][0-9]{4})$"));

        //VISA ^4[0-9]{12}([0-9]{}3)?$
    }
}
