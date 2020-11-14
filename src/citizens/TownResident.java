package citizens;

import items.Item;

public class TownResident extends Citizen{

    public TownResident(String name) {
        super(name);
    }

    @Override
    public void borrowItem(Item item) {
        super.borrowItem(item);
    }

    @Override
    public void returnBorrowedItem(Item item) {
        super.returnBorrowedItem(item);
    }
}
