package com.tiven.questy.LambdaExpressions.Employees;
// Lambdy uzywa sie tam gdzie interfejs posiada tylko jedna metode
// Takie interfejsy nazywane sa funkcyjnymi interfejsami

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

//parametry -> cialo

// Predicate :: warunki true or false
// Supplier :: bez argumentow ale zwraca wartosci
//Consumer :: nie zwraca wartosci
//Function :: argument - zwraca wartosc
//BiFunction :: dwa argumenty :: zwraca wartiosc
//UnaryOperator :: argument :: zwraca ten sam argument- tego samego typu
public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Buchalka", 22);
        Employee tim = new Employee("Tim Buchalkaa", 22);
        Employee jack = new Employee("Jack Sparroww", 33);
        Employee snow = new Employee("John Snoww", 44);
        Employee red = new Employee("Red Ridd", 35);
        Employee charmin = new Employee("LOLEK s", 31);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);
        employeeList.add(snow);
        employeeList.add(red);
        employeeList.add(charmin);

        // parameter/ return type
        Function<Employee, String> getLastName = employee -> employee.getName().substring(employee.getName().indexOf(' ') + 1);
        Function<Employee, String> getFirstName = employee -> employee.getName().substring(0, employee.getName().indexOf(' '));

        String lastName = getLastName.apply(employeeList.get(2));
        //  System.out.println(lastName);
        Random randomBoolean = new Random();
        for (Employee employee : employeeList) {
            if (randomBoolean.nextBoolean()) {
                System.out.println(getAName(getFirstName, employee));
            } else {
                System.out.println(getAName(getLastName, employee));
            }

        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> concatenate = name -> name.substring(0, name.indexOf(' '));
        Function chained = upperCase.andThen(concatenate);

        System.out.println(chained.apply(employeeList.get(0)));

        BiFunction<String, Employee, String> concatAge = (name, employee) -> name.concat(" " + employee.getAge());
        String upper = upperCase.apply(employeeList.get(0));
        System.out.println(concatAge.apply(upper, employeeList.get(0)));


        //UnaryOperator bierze argument i zwraca argument
        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello World");
//        printEmployeesByAge(employeeList, "Over 30", employee -> employee.getAge() > 30);
//        printEmployeesByAge(employeeList, "Less than 30", employee -> employee.getAge() <= 30);
//        printEmployeesByAge(employeeList, "Less than 25 using anonymous", new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getAge() < 25;
//            }
//        });
//
//        IntPredicate greaterThan15 = i -> i > 15;
//        IntPredicate lessThan100 = i -> i < 100;
//        System.out.println(greaterThan15.test(10));
//        int a = 15;
//        System.out.println(greaterThan15.test(a + 5));
//        System.out.println(greaterThan15.and(lessThan100).test(333));
//
//
//        Random random = new Random();
        //      Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(randomSupplier.get());
//        }
////        for (int i = 0; i < 10; i++) {
////            System.out.println(random.nextInt(1000));
////        }
//
//        employeeList.forEach(employee -> {
//            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
//            System.out.println("Last name is " + lastName);
//        });


    }

    private static String getAName(Function<Employee, String> function, Employee employee) {
        return function.apply(employee);
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("========================");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());

            }
        }
//        employees.forEach(employee -> {
//            if (employee.getAge() > 30) System.out.println(employee.getName());
//        });
    }

}
