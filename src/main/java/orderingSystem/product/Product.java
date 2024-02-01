package deliverySystem.warehouse.items;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class Product {
    @Setter @Getter
    private UUID productID;
    @Setter @Getter
    private String productName;
    @Setter @Getter
    private float price;
    @Setter @Getter
    private boolean isInStock;
    @Setter @Getter
    private Integer amountInStock;

    public Product(String name, float price, Integer amountInStock) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.ID = UUID.randomUUID();
        this.isInStock = true;
    }

    public void autoRestock(Integer amountInStock)
        { System.out.println("Request to provider for restocking")}
   }
