package com.tiven.questy.OOP;

// blueprint or template for creating objects
// state and behaviour  OBJECTS
public class Main {


    public static void main(String[] args) {

        Car porshe = new Car();
        Car holden = new Car();
        //   System.out.println("Model is : "+ porshe.getModel());
        porshe.setModel("233");
        System.out.println("Model is : " + porshe.getModel());

        BankAccount bankAccount = new BankAccount(); //(746716454262L, 2000.00, "Michal Wesolowski", "tivenstudio@gmail.com", "+48 668 977 425");
        bankAccount.setBalance(10000.14);
        bankAccount.deposit(300);
        bankAccount.withdraw(763467652);

        BankAccount myAccount = new BankAccount("Tim","uuhduhw","johdcbdv");
        System.out.println(myAccount.getAccountNumber() + " name " + myAccount.getCustomerName());


    }


}
