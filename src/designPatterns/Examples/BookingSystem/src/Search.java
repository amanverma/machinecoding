package designPatterns.Examples.BookingSystem.src;

import designPatterns.Examples.BookingSystem.model.Movie;

import java.util.Date;
import java.util.List;

public interface Search {
    public List<Movie> searchByTitle(String title);
    public List<Movie> searchByLanguage(String language);
    public List<Movie> searchByGenre(String genre);
    public List<Movie> searchByReleaseDate(Date relDate);
    public List<Movie> searchByCity(String cityName);
}
