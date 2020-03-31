package com.tiven.questy.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//LINKED LIST IS DOUBLE LINKED ... to PREVOIUS and TO THE NEXT

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVist = new LinkedList<>();
        addInOrder(placesToVist, "Sydney");
        addInOrder(placesToVist, "Melbourne");
        addInOrder(placesToVist, "Brisbane");
        addInOrder(placesToVist, "Perth");
        addInOrder(placesToVist, "Canberra");
        addInOrder(placesToVist, "Adelaide");
        addInOrder(placesToVist, "Darwin");
        // printList(placesToVist);
        addInOrder(placesToVist, "Alice Springs");
        addInOrder(placesToVist, "Darwin");
        printList(placesToVist);
        visit(placesToVist);
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday over / quit");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                default:
                    printMenu();
                    break;

            }
        }

    }

    private static void printMenu() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To quit");
        System.out.println("\t 1 - Go to next city");
        System.out.println("\t 2 - Go to previous city");
        System.out.println("\t X - Print Menu");

    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) // is there another entry?? starting from null ?
        {
            System.out.println("Now visiting " + i.next()); // moving to the next entry

        }
        System.out.println("========================");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparsion = stringListIterator.next().compareTo(newCity);
            if (comparsion == 0) {
                System.out.println(newCity + " is already included as a destination.");
                return false;
            } else if (comparsion > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparsion < 0) {
                //move on next city

            }
        }
        stringListIterator.add(newCity);
        return true;

    }
}
