/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Performance Assessment - Interface
 *
 * CargoTruck implements the Vehicle interface. It stores the make,
 * model, running status, destination, and cargo capacity of a truck.
 * It provides all required Vehicle methods and formatted output
 * through toString().
 */

public class CargoTruck implements Vehicle {

    private String Make;
    private String Model;
    private boolean Running;
    private String Destination;
    private String CargoCapacity;

    public CargoTruck(String make, String model,
            String cargoCapacity) {

        Make = make;
        Model = model;
        CargoCapacity = cargoCapacity;
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
            "Make: %s%nModel: %s%nThe truck is %s and hauling %s of cargo to %s.%n",
            Make,
            Model,
            runningStatus,
            CargoCapacity,
            Destination
        );
    }
}