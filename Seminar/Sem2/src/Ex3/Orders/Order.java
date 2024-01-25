package Ex3.Orders;

import java.util.List;

public class Order {
    private List<OrderLine> orderLines;

    public Order(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (OrderLine line : orderLines) {
            total += line.calculatePrice();
        }
        return total;
    }
}
