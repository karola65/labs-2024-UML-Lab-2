import orderingSystem.people.Customer;
import orderingSystem.payment.Payment;
import orderingSystem.product.Product;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Order {

    public enum Status {
        CREATED("Created"),
        PLACED("Received"),
        OTW("On the way"),
        DELIVERED("Delivered");

        private final String name;

        Status(String name) {
            this.name = name;
        }

        public String toString(){return this.name;}

    }
    @Getter
    private final UUID orderID;
    @Setter @Getter
    private Order.Status status;

    private Optional<Customer> customer;
    @Setter @Getter
    private LocalDate orderDate;
    @Setter @Getter
    private LocalDate deliveryDate;
    private List<Product> products;

    @Setter @Getter
    private LocalDate dispatchedDate;
    private 

    public Order(Status status, LocalDate orderDate, LocalDate deliveryDate) {
        this.orderID = UUID.randomUUID();
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
     
    }

    public Order(Order order) {
        this.orderID = order.getOrderID();
        this.status = order.getStatus();
        this.customer = order.getCustomer();
        this.orderDate = order.getOrderDate();
        this.deliveryDate = order.getDeliveryDate();
        this.payment = order.getPayment();
        this.products = order.getProducts();
        this.dispatchedDate = order.getDispatchedDate();
    }

    public Optional<Customer> getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = Optional.of(new Customer(customer));
    }

    public void makeRecieipt(UUID orderID, payment ) {
        System.out.println("This is recicipte for order ")
    }

    public void addToOrder(List<Product> orderedProducts) {
        this.orderedProducts = new ArrayList<>(orderedProducts);
    }
}
