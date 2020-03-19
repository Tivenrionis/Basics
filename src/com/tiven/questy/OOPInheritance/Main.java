package com.tiven.questy.OOPInheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");

        dog.eat(); // Accesed from main class derived from thou Dog class dont have the implementation of that method
        System.out.println("-----------------");
        dog.walk();
        System.out.println("-----------------");
        dog.run();

         // ALWAYS DO CONSTRUCTOR CHAINING
        // do not duplicate code


        // Overriding is known as Runtime Polimorphism and Dynamic Method Dispatch

        //STATIC METHODS
        //static methods used for operations that dont require any data from an instance od a class (this.)
        // Should be static? -> Does it use any fields or instance methods ? -> no ? go for it

        //STATIC VARIABLES

    }
}
