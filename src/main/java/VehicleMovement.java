package main.java;

public interface VehicleMovement {
    /*
      includes behaviour that any vechile can do:
      start();
      stop();
      calculateFuelConsumed(float km);
     */

    /**
     * vehicle start
     */
    void start();

    /* vehicle stop
     */
    void stop();

    /*
    move/calculateFuelConsumed the vehicle with the number of km specified as param
    @param kilometers to move
     */
    void drive(double distance);
}
