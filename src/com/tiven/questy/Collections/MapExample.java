package com.tiven.questy.Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 03.05.2020
 * Time: 22:58
 * Class name: Map
 * Description:
 */
public class MapExample {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")) {
            System.out.println("Java is there");
        } else {
            languages.put("Java", " a compiled high level, object-orientated, platform independent language");
           // System.out.println(languages.put("Java", "this course is about java"));
        }
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        // System.out.println(languages.get("Java"));
        if (languages.containsKey("Java")) {
            System.out.println("Java already exist");
        } else {
            languages.put("Java", "this course is about java");
        }

        System.out.println("============================================================");

        //languages.remove("Lisp");
        if (languages.remove("Algol","a family of algorithmic languages"))
        {
            System.out.println("Removed");
        }
        else System.out.println("Algol not removed");

        if (languages.replace("Lisp","Therein lies madness","something else"))
        {
            System.out.println("rep");
        } else System.out.println("not");
        System.out.println(languages.replace("Scala","will not be added"));

        for (String key : languages.keySet())
        {
            System.out.println(key+" : "+languages.get(key));
        }
    }
}
