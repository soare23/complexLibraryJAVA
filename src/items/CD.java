package items;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

public class CD extends Item{
    public CD(String name, UUID id, LocalDate borrowDate, long lenghtOfBorrowPeriod) {
        super(name, id, borrowDate, lenghtOfBorrowPeriod);
    }
}
