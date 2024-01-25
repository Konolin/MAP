package Ex3.Discounters;

import Ex3.Movies.Movie;

public class HorrorMovieDiscounter implements Discounter {
    @Override
    public double calculatePrice(Movie movie) {
        return movie.getBasePrice() * 0.9;
    }
}
