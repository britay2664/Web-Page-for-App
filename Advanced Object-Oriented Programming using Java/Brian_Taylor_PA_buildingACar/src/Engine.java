/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Composition
 *
 * This class represents an automobile engine. It stores the number
 * of cylinders, the approved gas type, and whether the engine uses
 * fuel injection. Public getters and setters provide access to the
 * private properties. The toString method returns formatted engine
 * information.
 *******************************************************************/

public class Engine {

    // Class properties
    private int cylinders;
    private String gasType;
    private boolean fuelInjected;

    // Constructor
    public Engine(int cylinders, String gasType, boolean fuelInjected) {
        this.cylinders = cylinders;
        this.gasType = gasType;
        this.fuelInjected = fuelInjected;
    }

    // Getters and setters

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public boolean isFuelInjected() {
        return fuelInjected;
    }

    public void setFuelInjected(boolean fuelInjected) {
        this.fuelInjected = fuelInjected;
    }

    // Return formatted engine information
    @Override
    public String toString() {
        return String.format(
                "Number of Cylinders: %d%n"
                        + "Approved Gas Type: %s%n"
                        + "Fuel Injected: %s",
                cylinders,
                gasType,
                fuelInjected
        );
    }
}