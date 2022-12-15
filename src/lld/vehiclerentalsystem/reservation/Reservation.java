package lld.vehiclerentalsystem.reservation;

import lld.vehiclerentalsystem.Location;
import lld.vehiclerentalsystem.User;
import lld.vehiclerentalsystem.product.Vehicle;

import java.util.Date;

public class Reservation {

    public int reservationId;
    User user;
    public Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    public ReservationStatus reservationStatus;
    Location location;

    public int createReserve(User user, Vehicle vehicle){

        //generate new id
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }

    // CRUD operations

}
