package citizens;

import items.Item;

public class Student extends Citizen{
    public Student(String name) {
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
