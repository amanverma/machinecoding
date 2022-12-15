package lld.parkinglot;

import lld.parkinglot.vehicle.Vehicle;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FareController {


    private Map<Vehicle, ParkingDetails> vehicleParkingDetailsMap = new HashMap<>();

    public void onVehicleEntry(Vehicle vehicle, ParkingLot parkingLot) {
        vehicleParkingDetailsMap.put(vehicle, new ParkingDetails(vehicle, parkingLot, new Date(), null));
    }

    public void onVehicleExit(Vehicle vehicle) {
        ParkingDetails parkingDetails = vehicleParkingDetailsMap.get(vehicle);
        parkingDetails.exitTime = new Date();
    }

    public BigDecimal getFare(Vehicle vehicle) {
        ParkingDetails parkingDetails = vehicleParkingDetailsMap.get(vehicle);
        return getFare(parkingDetails.parkingLot, parkingDetails.entryTime, parkingDetails.exitTime);
    }

    private BigDecimal getFare(ParkingLot parkingLot, Date entryTime, Date exitTime) {
        return null;
    }

}
