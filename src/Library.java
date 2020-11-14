import citizens.Citizen;
import citizens.Student;
import citizens.TownResident;
import items.Item;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Library {
    private ArrayList<Item> borrowedItems = new ArrayList<>();
    private ArrayList<Item> availableItems = new ArrayList<>();
    private ArrayList<Citizen> registeredCitizens = new ArrayList<>();

    public Library() {
    }

    public void addItemToBorrowedItems(Citizen citizen, Item item){
        if(citizen.isRegistered() && citizen.isCanBorrow()){
            LocalDate date = LocalDate.now();
            item.setBorrowDate(date);
            citizen.borrowItem(item);
            borrowedItems.add(item);
        }
    }

    public void addCitizenToRegisteredCitizens(Citizen citizen){
        citizen.setRegistered(true);
        registeredCitizens.add(citizen);
    }

    public void acceptReturnedItem(Citizen citizen, Item item){
        citizen.returnBorrowedItem(item);
        borrowedItems.remove(item);
        availableItems.add(item);

    }

    public void verifyAllItemsAndNotifyLateCitizens(){
        ArrayList<UUID> overdueItems = new ArrayList<UUID>();
        borrowedItems.forEach(item ->{
            if(item.getBorrowDate().compareTo(item.getBorrowDate().plusDays(item.getLenghtOfBorrowPeriod()))){
                overdueItems.add(item.getId());
            }
        });

        overdueItems.forEach(overdueItem -> {
            registeredCitizens.forEach(citizen -> {
                if(citizen.getBorrowedItems().contains(overdueItem)){
                    System.out.println(citizen.getName() + " you have items overdue!");
                }
            });
        });
    }

    public void verifyMaximumNumberOfItemsBorrowed(Citizen citizen){
        if(citizen instanceof Student && citizen.getNoOfItemsBorrowed() > 3){
            citizen.setCanBorrow(false);
        } else if(citizen instanceof TownResident && citizen.getNoOfItemsBorrowed() > 5){
            citizen.setCanBorrow(false);
        }
    }


}
