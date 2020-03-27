package com.tiven.questy.ArrayLists;

import java.util.Scanner;

public class MobileMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        while (!quit) {
            System.out.println("Enter your choice: ");
            options();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 0:
                    options();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = true;
                    break;

            }


        }

    }

    public static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");

        } else {
            System.out.println("Name = " + existingContactRecord.getName() + " phone = " + existingContactRecord.getNumber());
        }
    }

    public static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else System.out.println("Error deleting contact. ");
    }

    public static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newCotact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newCotact)) {
            System.out.println("Successfully updated record. ");
        } else System.out.println("Error updating record. ");


    }

    public static void startPhone() {
        System.out.println("Starting phone ...");
    }

    public static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.store(newContact)) System.out.println("Successfully added: " + name + " phone = " + phone);

    }

    public static void printContacts() {
        mobilePhone.printContacts();
    }

    public static void options() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - Contacts");
        System.out.println("\t 2 - Store contact");
        System.out.println("\t 3 - Modify contact");
        System.out.println("\t 4 - Remove contact");
        System.out.println("\t 5 - Search for contact");
        System.out.println("\t 6 - Shut down");

    }


}
