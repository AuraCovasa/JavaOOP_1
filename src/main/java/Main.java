package main.java;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        //Car car1 = new Dacia(27, "oiqe0934hkkadsn");
        Car carLogan = new Logan(27, "oiqe0934hkkadsn");
        System.out.println(((Logan) carLogan).availableFuelLogan);
        System.out.println(carLogan.chassisNumber);
        Logan carLogan2 = new Logan(27, "oiqe0934hkkadsn");
        System.out.println(carLogan2.availableFuelLogan);
        System.out.println(carLogan2.chassisNumber);

        float availableFuelrun = carLogan2.availableFuelLogan;
        System.out.println("Available fuel: " + availableFuelrun);

        carLogan2.start();
        carLogan2.shiftGear(1);
        carLogan2.drive(10);
        carLogan2.shiftGear(3);
        carLogan2.drive(2);
        carLogan2.shiftGear(4);
        carLogan2.drive(0.5);
        carLogan2.shiftGear(4);
        carLogan2.drive(0.5);
        carLogan2.shiftGear(5);
        carLogan2.drive(10);
        carLogan2.shiftGear(4);
        carLogan2.drive(0.5);
        carLogan2.shiftGear(3);
        carLogan2.drive(0.1);
        carLogan2.stop();
        availableFuelrun = carLogan2.availableFuelLogan;
        System.out.println("Available fuel: " + availableFuelrun);

        float fuelConsumedPer100Km = carLogan2.getAverageFuelConsumption();
        System.out.println("Average fuel consumption: " + fuelConsumedPer100Km);

        AbstractVehicle vehicle = new VWGolf(30, "1987ddkshik289");
        vehicle.start();
        vehicle.drive(1);
        vehicle.stop();

        Car carV = (Car) vehicle;
        float availableFuel = carV.getAvailableFuel();
        float fuelConsumedPer100KmVW = carV.getAvailableFuel();



    }
}