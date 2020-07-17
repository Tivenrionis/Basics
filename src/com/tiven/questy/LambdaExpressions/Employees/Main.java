package com.tiven.questy.LambdaExpressions.Employees;
// Lambdy uzywa sie tam gdzie interfejs posiada tylko jedna metode
// Takie interfejsy nazywane sa funkcyjnymi interfejsami

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//parametry -> cialo
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
        printEmployeesByAge(employeeList, "Over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employeeList, "Less than 30", employee -> employee.getAge() <= 30);

//        for (Employee employee : employeeList)
//        {
//            if (employee.getAge() >30)
//            {
//                System.out.println(employee.getName());
//            }
//        }
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
