package Ex3;

public class SciFiMovieDiscounter implements Discounter {
    @Override
    public double calculatePrice(Movie movie) {
        return movie.getBasePrice();
    }
}
