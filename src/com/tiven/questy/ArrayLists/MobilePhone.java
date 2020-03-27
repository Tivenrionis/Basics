package com.tiven.questy.ArrayLists;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public void printContacts() {
        System.out.println("Contact list: ");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName() + " phone: " + contact.getNumber());
        }
    }


    public boolean store(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already on file");
            return false;
        }
        contacts.add(contact);
        return true;
    }


    public boolean updateContact(Contact oldContact, Contact newContact) {
//        if (contacts.contains(oldContact)) {
//            contacts.set(contacts.indexOf(oldContact), newContact);
//        }
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;

    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;


    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String name) {

        for (Contact c : this.contacts) {

            if (c.getName().equals(name)) return contacts.indexOf(c);
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int pos = findContact(name);
        if (pos >= 0) {
            return this.contacts.get(pos);
        }
        return null;
    }


}
