/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Performance Assessment - Interface
 *
 * Car implements the Vehicle interface. It stores the make, model,
 * running status, and destination of a car and provides the required
 * Vehicle methods along with formatted output through toString().
 */

public class Car implements Vehicle {

    private String Make;
    private String Model;
    private boolean Running;
    private String Destination;

    public Car(String make, String model) {

        Make = make;
        Model = model;
        Running = false;
        Destination = "No destination";
    }

    @Override
    public String getMake() {
        return Make;
    }

    @Override
    public String getModel() {
        return Model;
    }

    @Override
    public void start() {
        Running = true;
    }

    @Override
    public void stop() {
        Running = false;
    }

    @Override
    public void drive(String destination) {
        Destination = destination;
    }

    @Override
    public String toString() {

        String runningStatus;

        if (Running) {
            runningStatus = "running";
        } else {
            runningStatus = "not running";
        }

        return String.format(
            "Make: %s%nModel: %s%nThe car is %s and is heading to %s.%n",
            Make,
            Model,
            runningStatus,
            Destination
        );
    }
}