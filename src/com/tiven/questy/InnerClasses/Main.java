package com.tiven.questy.InnerClasses;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        // how to instantiate inner :: class correct way
        Gearbox mcLaren = new Gearbox(6);
        //you dont wnat to let acces to Gear  so change inner class as private
        //  Gearbox.Gear first = mcLaren.new Gear(1, 12.3);

        // System.out.println(first.driveSpeed(1000));

        //errors .. cant do that
        // Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
        //Gearbox.Gear third = new mcLaren.Gear(2, 15.4);

//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));


        //LOCAL CLASS
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        //btnPrint.setOnClickListener(new ClickListener());

        //ANONYMOUS CLASS  MORE USAGE
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title+ "was cliced.");
            }
        });

        listen();
    }

    private static void listen() {
        boolean quit = false;

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}
