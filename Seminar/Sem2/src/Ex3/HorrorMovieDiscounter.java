package Ex3;

public class HorrorMovieDiscounter implements Discounter {
    @Override
    public double calculatePrice(Movie movie) {
        return movie.getBasePrice() * 0.9;
    }
}
