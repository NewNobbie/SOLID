package Orders;

import java.util.List;

public class Order {

    private List<String> items;
    private double totalAmount;

    public Order(List<String> items) {
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
         return 1.0;
    }

    private List<String> getItems() {
        return items;
    }

    private double getTotalAmount() {
        return totalAmount;
    }

}




