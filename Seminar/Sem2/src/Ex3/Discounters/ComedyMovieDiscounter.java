package Ex3.Discounters;

import Ex3.Movies.Movie;

public class ComedyMovieDiscounter implements Discounter {
    @Override
    public double calculatePrice(Movie movie) {
        if (movie.getCast().contains("Adam Sandler")) {
            return movie.getBasePrice() * 0.5;
        }
        return movie.getBasePrice();
    }
}
