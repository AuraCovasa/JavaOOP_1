package main.java;

public class Logan extends Dacia {
    public float availableFuelLogan;
    public String chassisNumberLogan;
    public int consumptionPer100Km = 10;
    public double tyreSize = 16;
    public double consumptionForDrive;
    public float totalConsumption;
    public float averageFuelConsumption;

    public Logan(float availableFuelLogan, String chassisNumberLogan) {
        super();
        this.availableFuelLogan = availableFuelLogan;
        this.chassisNumber = chassisNumberLogan;
    }

    @Override
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
        averageFuelConsumption = (totalConsumption / totalDistance) *100;
        return averageFuelConsumption;
    }



}
