package com.tiven.questy.ArrayLists;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");

        for (String s : groceryList) {
            System.out.println(s);
        }

    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("You've romoved " + item + " from grocery list at position " + position);

    }

    public String findItem(String searchItem) {
        // boolean exist = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) return groceryList.get(position);
        return null;


    }
}
