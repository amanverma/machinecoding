package designPatterns.Examples.BookingSystem.model;

import designPatterns.Examples.BookingSystem.src.CinemaHall;

import java.util.Date;

//A movie will have many shows
public class Show {

    private int showId;
    private Date createdOn;
    private Date startTime;
    private Date endTime;
    private CinemaHall playedAt;
    private Movie movie;
}