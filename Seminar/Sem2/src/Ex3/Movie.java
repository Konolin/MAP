package Ex3;

import java.util.List;

public class Movie {
    private String title;
    private double basePrice;
    private List<String> cast;

    public Movie(String title, double basePrice, List<String> cast) {
        this.title = title;
        this.basePrice = basePrice;
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", basePrice=" + basePrice +
                ", cast=" + cast +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public List<String> getCast() {
        return cast;
    }

    public double calculatePrice() {
        return basePrice;
    }
}
