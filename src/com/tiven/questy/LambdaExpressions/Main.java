package com.tiven.questy.LambdaExpressions;
// Lambdy uzywa sie tam gdzie interfejs posiada tylko jedna metode
// Takie interfejsy nazywane sa funkcyjnymi interfejsami

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//parametry -> cialo
public class Main {
    public static void main(String[] args) {
//        new Thread(new CodeToRun()).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello from anonymous");
//            }
//        }).start();

        new Thread(() -> {
            System.out.println("From runnable lambda");
            System.out.println("Line 2");
            System.out.println("this is line three");
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 22);
        Employee jack = new Employee("Jack Sparrow", 33);
        Employee snow = new Employee("John Snow", 44);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);
        employeeList.add(snow);


//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employeeList, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        employeeList.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());

        });

//        for (Employee employee : employeeList) {
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, employeeList.get(0).getName(), employeeList.get(1).getName());
//        System.out.println(sillyString);

//
//        UpperConcat uc = (s1, s2) -> {
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };
//
//        String sillyString = doStringStuff(uc, employeeList.get(0).getName(), employeeList.get(1).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        System.out.println(anotherClass.doSomething());
    }

    final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    String upperAndConcat(String s1, String s2);

}

class AnotherClass {

    //    public String doSomething() {
//        System.out.println("Another class name " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class name is " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");
//    }
/*    public String doSomethingNested() {
        int i = 0;
        {
            UpperConcat uc = new UpperConcat() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    //PROBLEM BO MUSI BYC FINAL
                    System.out.println(i);
                    return s1.toUpperCase() + s2.toUpperCase();
                }
            };

            System.out.println(getClass().getSimpleName());

            i++;
            System.out.println(i);
            return Main.doStringStuff(uc, "s2", "s3");
        }
    }*/

    public String doSomething() {
        int i = 0;
        UpperConcat uc = (s1, s2) ->
        {
            System.out.println("The lambda expression class is " + getClass().getSimpleName());
            System.out.println(" i in the lambda " + i);
            String res = s1.toUpperCase() + s2.toUpperCase();
            return res;
        };

        System.out.println("Another class name " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
    }
}