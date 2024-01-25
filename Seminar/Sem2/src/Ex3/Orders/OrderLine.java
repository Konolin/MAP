package Ex3.Orders;

import Ex3.Discounters.Discounter;
import Ex3.Movies.Movie;

public class OrderLine {
    private int quantity;
    private Movie movie;
    private Discounter discounter;

    public OrderLine(int quantity, Movie movie, Discounter discounter) {
        this.quantity = quantity;
        this.movie = movie;
        this.discounter = discounter;
    }

    public double calculatePrice() {
        return quantity * discounter.calculatePrice(movie);
    }
}
