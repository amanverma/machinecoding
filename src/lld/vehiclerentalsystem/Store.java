package lld.vehiclerentalsystem;

import lld.vehiclerentalsystem.product.Vehicle;
import lld.vehiclerentalsystem.product.VehicleType;
import java.util.List;

public class Store {

    int storeId;
    List<Vehicle> vehicleList;
    Location storeLocation;



    public List<Vehicle> getVehicles(VehicleType vehicleType) {

        return vehicleList;
    }


    //addVehicles, update vehicles, use inventory management to update those.


    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicleList = vehicles;
    }


    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }
}
