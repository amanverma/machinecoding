package designPatterns.Examples.BookingSystem.Actors;

import designPatterns.Examples.BookingSystem.Constants.Constants;
import designPatterns.Examples.BookingSystem.model.Address;
import designPatterns.Examples.BookingSystem.model.Movie;
import designPatterns.Examples.BookingSystem.model.Show;
import designPatterns.Examples.BookingSystem.src.Booking;

import java.util.List;

public class Actors {
// For simplicity, we are not defining getter and setter functions. The reader can
// assume that all class attributes are private and accessed through their respective
// public getter method and modified only through their public setter method.

    public abstract class Account {
        private String id;
        private String password;
        private Constants.AccountStatus status;

        public abstract boolean resetPassword();
    }

    public abstract class Person {
        private String name;
        private Address address;
        private String email;
        private String phone;
        private Account account;
    }

    public abstract class Customer extends Person {
        public abstract boolean makeBooking(Booking booking);
        public abstract List<Booking> getBookings();
    }

    public abstract class Admin extends Person {
        public abstract boolean addMovie(Movie movie);
        public abstract boolean addShow(Show show);
        public abstract boolean blockUser(Customer customer);
    }

    public abstract class FrontDeskOfficer extends Person {
        public abstract boolean createBooking(Booking booking);
    }

    public abstract class Guest {
        public abstract boolean registerAccount();
    }

}
