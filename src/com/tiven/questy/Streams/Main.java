package com.tiven.questy.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println); // terminal operation -> nie mozna isc dalej bo Consumer nie zwraca wartosci.. koniec akcji streamow

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("================");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println) // Intermediate operation -> niby zwraca void przy Consumerze  ale przepisuje wartosci i zwraca nowy stream
                .count());
        System.out.println("=============================");
        List<String> sortedNumbers = bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());

        sortedNumbers.forEach(System.out::println);
        System.out.println("=============================");

        System.out.println("=============================");
        List<String> sortedNumbers2 = bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        sortedNumbers2.forEach(System.out::println);
        System.out.println("=============================");


// Mozna to ogarnac  wjednej lini
/*        bingoNumbers.forEach(number -> {
            if (number.toUpperCase().startsWith("G")) {
                gNumbers.add(number);
                // System.out.println(number);
            }
        });

        gNumbers.sort((s1, s2) -> s1.compareTo(s2));
        gNumbers.forEach(bingoNumber -> System.out.println(bingoNumber));*/


        Employee john = new Employee("John Doe", 30);
        Employee jack = new Employee("Jack Deer", 25);
        Employee sparrow = new Employee("Jack Sparrow", 40);
        Employee snow = new Employee("John Snow", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(john);
        hr.addEmployee(jack);
        hr.addEmployee(sparrow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(snow);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        Map<Integer, List<Employee>> groupedByAge = departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));


        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);
// OPERATION IN STREAMS ARE LAZLY EVALUATED ---> INTERMEDIATE OPERATIONS ARE NOT EVALUATED UNTIL THERES A TERMINAL OPERATION
    }
}
