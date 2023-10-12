package Ex3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderLine orderLine1 = new OrderLine(10, new ComedyMovie("Bad movie", 10, List.of("Adam Sendler")), new ComedyMovieDiscounter());
        OrderLine orderLine2 = new OrderLine(5, new ComedyMovie("Bad movie 2", 12, List.of("Adam Sasler")), new ComedyMovieDiscounter());

        Order order = new Order(List.of(orderLine1, orderLine2));

        System.out.println(order.calculateTotalPrice());
    }
}
