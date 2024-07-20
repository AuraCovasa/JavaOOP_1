package main.java;

public abstract class AbstractVehicle implements VehicleMovement {
    public float availableFuel;
    public String chassisNumber;

    public AbstractVehicle() {

    }

    public AbstractVehicle(float availableFuel,String chassisNumber) {
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;

    }
}