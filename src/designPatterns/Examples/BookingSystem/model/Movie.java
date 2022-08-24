package designPatterns.Examples.BookingSystem.model;

import designPatterns.Examples.BookingSystem.Actors.Actors;

import java.util.Date;
import java.util.List;

public abstract class Movie {
    private String title;
    private String description;
    private int durationInMins;
    private String language;
    private Date releaseDate;
    private String country;
    private String genre;
    private Actors.Admin movieAddedBy;

    private List<Show> shows;
    public abstract List<Show> getShows();
}

