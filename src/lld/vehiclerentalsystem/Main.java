package lld.vehiclerentalsystem;

import lld.vehiclerentalsystem.payment.Bill;
import lld.vehiclerentalsystem.payment.CardPayment;
import lld.vehiclerentalsystem.product.Car;
import lld.vehiclerentalsystem.product.Vehicle;
import lld.vehiclerentalsystem.product.VehicleType;
import lld.vehiclerentalsystem.reservation.Reservation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {


        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem();
        rentalSystem.setStores(stores);
        //singleton class

        //0. User comes
        User user = users.get(0);

        //1. user search store based on location
        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        Store store = rentalSystem.getStore(location);

        //2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);


        //3.reserving the particular vehicle
        Reservation reservation = rentalSystem.createReservation(storeVehicles.get(0), users.get(0));


       //4. trip completed, submit the vehicle and close the reservation
        Bill bill = rentalSystem.completeReservation(reservation.reservationId);

        //5. make payment
        rentalSystem.makePayment(bill);

    }



    public static List<Vehicle> addVehicles(){

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleID(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle1.setVehicleID(2);
        vehicle1.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<User> addUsers(){

        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);
        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){

        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }

}
