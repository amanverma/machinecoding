package designPatterns.Examples.BookingSystem.src;

import designPatterns.Examples.BookingSystem.model.Movie;

import java.util.Date;
import java.util.List;

//Catalog will implement Search to facilitate searching of products.

public class Catalog implements  Search{
    @Override
    public List<Movie> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return null;
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return null;
    }

    @Override
    public List<Movie> searchByReleaseDate(Date relDate) {
        return null;
    }

    @Override
    public List<Movie> searchByCity(String cityName) {
        return null;
    }
}
