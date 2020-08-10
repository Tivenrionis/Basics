package com.tiven.questy.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challanges {
    public static void main(String[] args) {

        String challange1 = "I want a bike.";
        String regexp1 = "^I want a bike.$";
        System.out.println(challange1.matches(regexp1));

        //String challange1 = "I want a bike.";
        String challange2 = "I want a ball.";

        String regExp2 = "^I want a .+(\\.)$";
        System.out.println(challange1.matches(regExp2));
        System.out.println(challange2.matches(regExp2));

        String regExp22 = "^I want a (bike|ball).";
        System.out.println(challange1.matches(regExp22));
        System.out.println(challange2.matches(regExp22));

        String regExp222 = "^I want a \\w+.";
        System.out.println(challange1.matches(regExp222));
        System.out.println(challange2.matches(regExp222));

        //challange 3

        Pattern pattern = Pattern.compile(regExp222);
        Matcher matcher = pattern.matcher(challange1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challange2);
        System.out.println(matcher.matches());

        //challaneg 4

        String chal4 = "Replace all blanks with underscores.";
        String reg4 = "\\s";
        System.out.println(chal4.replaceAll(reg4, "_"));

        //challange 5

        String chal5 = "aaabccccccccdddefffg";
        System.out.println(chal5.matches("[abcdefg]+"));
        System.out.println(chal5.matches("[a-g]+"));
        System.out.println(chal5.matches("^a+bc+d+ef+g$"));

        //challange 6
        System.out.println(chal5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        //challange 7

        System.out.println("abcd.123".matches("[a-z]+\\.[0-9]+"));
        System.out.println("f5.13".matches("[a-z]+\\.[0-9]+"));
        System.out.println("kjisl.22".matches("[a-z]+\\.[0-9]+"));

        System.out.println("AaAbcd.123".matches("^[A-Za-z]+\\.\\d+$"));

        String x = "abcd.123\tfjktl.7\ttzik.999\n";

        String reg = "([A-Za-z]+)(\\.)(\\d+)\\s";
        Pattern pattern1 = Pattern.compile(reg);
        Matcher matcher1 = pattern1.matcher(x);
        int count = 0;
        while (matcher1.find()) {
            count++;
            System.out.println("Occurance " + count + " : " + matcher1.group(3));
            System.out.println("Occurance " + count + " : " + matcher1.start(3) + " to " + (matcher1.end(3) - 1));
        }

        //challange 11

        String chal11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String regx = "\\{(.+?)\\}";
        Pattern patx = Pattern.compile(regx);
        Matcher mm = patx.matcher(chal11);
        System.out.println(mm.matches());
        mm.reset();
        count = 0;

        while (mm.find()) {
            count++;
            System.out.println("Occurance " + count + " : " + mm.group(1));
        }

        //challange 12

        String zip = "62-052";

        String zipReg = "^[0-9]{2}-[0-9]{3}(\\s[a-z]{3})?$";
        System.out.println(zip.matches(zipReg));
    }
}
