package Ex3;

public class ComedyMovieDiscounter implements Discounter {
    @Override
    public double calculatePrice(Movie movie) {
        if (movie.getCast().contains("Adam Sendler")) {
            return movie.getBasePrice() * 0.5;
        }
        return movie.getBasePrice();
    }
}
