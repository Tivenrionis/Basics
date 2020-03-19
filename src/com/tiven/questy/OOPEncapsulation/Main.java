package com.tiven.questy.OOPEncapsulation;


public class Main {
    public static void main(String[] args) {


        Player player = new Player();
        player.name="Tiven";
        player.health=20;
        player.weapon="Sword";

        player.looseHealt(10);
        System.out.println("Remaining health: "+ player.healthRemaining());

        player.looseHealt(12);
        System.out.println("Remaining health: "+ player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Tiven",500,"sword");
        player1.looseHealt(300);
        System.out.println("Remaining health: "+ player1.getHitPoints());
//        System.out.println(player1.getClass());
//        System.out.println(player1.getClass().getCanonicalName());
//        System.out.println(player1.getClass().getSimpleName());

    }
}
