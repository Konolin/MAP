package Ex3.Discounters;

import Ex3.Movies.Movie;

public class SciFiMovieDiscounter implements Discounter {
    @Override
    public double calculatePrice(Movie movie) {
        return movie.getBasePrice();
    }
}
