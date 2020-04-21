package com.tiven.questy.AbstractClasses;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 21.04.2020
 * Time: 23:10
 * Class name: MyLinkList
 * Description:
 */
public class MyLinkList implements NodeList {
    private ListItem root = null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            //the list was empty. so this item becomes the head of the list
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparsion = (currentItem.compareTo(item));
            if (comparsion < 0) {
                //item is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //there is no next, so insert at end of list
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            } else if (comparsion > 0) {
                //item is less. insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(item).setPrevious(item);
                } else {
                    //the node with a previous is the root
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
            } else {
                //equal
                System.out.println(item.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) System.out.println("List is empty");
        else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();

            }
        }
    }
}
