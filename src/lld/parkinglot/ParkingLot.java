package lld.parkinglot;

import java.util.List;

public class ParkingLot {
    private String parkingLotId;
    private List<Floor> floors;
    private String parkingLotName;
    private String address;

    public ParkingLot(String parkingId, List<Floor> floors, String parkingName, String address) {
        this.parkingLotId = parkingId;
        this.floors = floors;
        this.parkingLotName = parkingName;
        this.address = address;
    }

    public void emptyWholeParkingLot() {
        for (Floor floor : floors) {
            floor.emptyFloor();
        }
    }
}

