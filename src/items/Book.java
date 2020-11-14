package items;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

public class Book  extends Item{
    public Book(String name, UUID id, LocalDate borrowDate, long lenghtOfBorrowPeriod) {
        super(name, id, borrowDate, lenghtOfBorrowPeriod);
    }
}
