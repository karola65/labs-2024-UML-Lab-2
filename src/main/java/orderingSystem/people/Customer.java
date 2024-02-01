
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public class Customer {
 
    @Getter @Setter
    private UUID customerID;

    @Setter @Getter
    private String name;

    @Setter @Getter
    private String address;

    public Customer(String name, String address) {
        this.customerID = UUID.randomUUID();
        this.name = name;
        this.address = address;
    }

    public void changeAdress(String adress){
        this.address = address;
    }

}
