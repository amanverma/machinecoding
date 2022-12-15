package lld.vehiclerentalsystem;


import lld.vehiclerentalsystem.payment.Bill;
import lld.vehiclerentalsystem.payment.PaymentInterface;
import lld.vehiclerentalsystem.product.Status;
import lld.vehiclerentalsystem.product.Vehicle;
import lld.vehiclerentalsystem.reservation.Reservation;
import lld.vehiclerentalsystem.reservation.ReservationStatus;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    private VehicleRentalSystem vehicleRentalSystem;

    // Singleton class

    List<Store> storeList;
    List<Reservation> reservations = new ArrayList<>();

    public void setPaymentInterface(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    PaymentInterface paymentInterface;



    VehicleRentalSystem() {}

    public void setStores(List<Store> stores){
        this.storeList = stores;
    }


    public VehicleRentalSystem getVehicleRentalSysten(){
        if(vehicleRentalSystem==null){
            return new VehicleRentalSystem();
        }else return vehicleRentalSystem;
    }



    public Store getStore(Location location){
        //based on location, we will filter out the Store from storeList.
        return storeList.get(0);
    }


    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public Bill completeReservation(int reservationID) {
        //generate bill

        Reservation reservation = reservations.get(reservationID);
        reservation.reservationStatus = ReservationStatus.COMPLETED;
        reservation.vehicle.setStatus(Status.INACTIVE);

        //take out the reservation from the list and call complete the reservation method.
        return generateBill(reservationID);
    }

    private Bill generateBill(int reservationID) {
        //logic to compute bill and return amount
        return new Bill(reservations.get(reservationID));
    }

    public void makePayment(Bill bill){
        paymentInterface.makePayment(bill);
    }



    //addUsers

    //remove users


    //add stores

    //remove stores



}
