package com.tiven.questy.OOPMasterChallange;

public class Main {
    public static void main(String[] args) {

        Burger burger = new Hamburger("Roll",25);
        Burger burger1 = new HealthyBurger("chicken",30);
        Burger burger2 = new DeluxeHamburger("DoubleHam","Sesame roll", 40);

        System.out.println(burger.getPrice());
        burger.getAllAdditionsAndPrices();
        Addition[] additions = {new Addition("Tomato",5) , new Addition("Onion",3)};
        burger.setAdditions(additions);
        System.out.println("PRICE AFTER ADDITION: "+ burger.getPrice());
        burger.getAllAdditionsAndPrices();
        System.out.println("------------------------------------");

        System.out.println(burger1.getPrice());
        burger1.getAllAdditionsAndPrices();
        Addition[] additions2= {new Addition("Cheese",11) , new Addition("Cucumber",16)};
        burger1.setAdditions(additions2);
        System.out.println("PRICE AFTER ADDITION: "+burger1.getPrice());
        burger1.getAllAdditionsAndPrices();
        System.out.println("------------------------------------");
        
        System.out.println(burger2.getPrice());
        burger2.getAllAdditionsAndPrices();
        Addition[] additions3= {new Addition("Extra Meat",28) , new Addition("Extra cheese",11)};
        burger2.setAdditions(additions2);
        System.out.println("PRICE AFTER ADDITION: "+burger2.getPrice());
        burger2.getAllAdditionsAndPrices();
        System.out.println("------------------------------------");









    }
}
