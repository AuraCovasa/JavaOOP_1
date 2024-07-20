package main.java;

public class Car extends AbstractVehicle implements VehicleMovement {

    public float availableFuel;
    public String chassisNumber;
    public float totalDistance;

    public Car() {
        System.out.println("The parameterless Car has been created");
    }

    public Car(float availableFuel, String chassisNumber) {
        super();
        System.out.println("The parameter Car has been created");
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void drive(double distance) {
        System.out.println("Car moved " + distance + "km");
        totalDistance += distance;
        System.out.println("Total distance droven: " + totalDistance);
    }

    public void shiftGear(int gear) {
        System.out.println("Car shifted gears to gear " + gear);
    }

    public float getAvailableFuel(){
        return availableFuel;
    }

    public void setAvailableFuel(float availableFuel){
        this.availableFuel=availableFuel;
    }

}
