package main.java;

public class VWGolf extends Car {
    public String chassisNumberGolf;
    private float availableFuelGolf;
    private float consumptionPer100Km;
    public double tyreSize = 18;
    private float consumptionForDrive;
    private float totalConsumption;
    private float averageFuelConsumption;

    public VWGolf(float availableFuelGolf, String chassisNumberGolf) {
        super();
        this.availableFuelGolf = availableFuelGolf;
        this.chassisNumberGolf = chassisNumberGolf;
    }

    public void drive(double distance) {
        System.out.println("Car moved " + distance + "km");
        totalDistance += distance;
        System.out.println("Total distance droven: " + totalDistance);
        double consumption = (this.consumptionPer100Km * distance) / 100.0 * (1 + (this.tyreSize - 15) * 0.05);
        this.consumptionForDrive += consumption;
        totalConsumption += this.consumptionForDrive;
        System.out.println("Total consumption for this drive: " + consumptionForDrive);
        System.out.println("Total overall consumption: " + totalConsumption);
    }

    public float getAverageFuelConsumption() {
        averageFuelConsumption = (totalConsumption / totalDistance) * 100;
        return averageFuelConsumption;
    }
}




