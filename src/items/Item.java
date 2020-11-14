package items;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

public abstract class Item {
    private String name;
    private UUID id;
    private LocalDate borrowDate;
    private long lenghtOfBorrowPeriod;


    public Item(String name, UUID id, LocalDate borrowDate, long lenghtOfBorrowPeriod) {
        this.name = name;
        this.id = id;
        this.borrowDate = borrowDate;
        this.lenghtOfBorrowPeriod = lenghtOfBorrowPeriod;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public UUID getId() {
        return id;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public long getLenghtOfBorrowPeriod() {
        return lenghtOfBorrowPeriod;
    }

    public void setLenghtOfBorrowPeriod(long lenghtOfBorrowPeriod) {
        this.lenghtOfBorrowPeriod = lenghtOfBorrowPeriod;
    }
}
