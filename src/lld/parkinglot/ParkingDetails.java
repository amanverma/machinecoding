package lld.parkinglot;

import lld.parkinglot.vehicle.Vehicle;

import java.util.Date;

class ParkingDetails {
    Vehicle vehicle;
    ParkingLot parkingLot;
    Date entryTime;
    Date exitTime;

    public ParkingDetails(Vehicle vehicle, ParkingLot parkingLot, Date entryTime, Date exitTime) {
        this.vehicle = vehicle;
        this.parkingLot = parkingLot;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }
}