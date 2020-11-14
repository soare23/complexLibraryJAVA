package citizens;

import items.Item;

import java.util.ArrayList;

public abstract class Citizen {
    private String name;
    private boolean isRegistered = false;
    private int noOfItemsBorrowed;
    private boolean canBorrow = true;
    private ArrayList<Item> borrowedItems = new ArrayList<Item>();

    public Citizen(String name) {
        this.name = name;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public boolean isCanBorrow() {
        return canBorrow;
    }

    public void setCanBorrow(boolean canBorrow) {
        this.canBorrow = canBorrow;
    }

    public int getNoOfItemsBorrowed() {
        return noOfItemsBorrowed;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public void borrowItem(Item item){
        borrowedItems.add(item);
        noOfItemsBorrowed += 1;
    }

    public void returnBorrowedItem(Item item){
        borrowedItems.remove(item);
        noOfItemsBorrowed -= 1;
    }


}
