/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 *
 * This class represents a Truck object. It extends the Motorized
 * class by adding a description of its load capacity and an
 * indicator of whether towing is enabled. Getters and setters
 * provide public access to the private properties. The toString
 * method returns all inherited and Truck properties.
 *******************************************************************/

public class Truck extends Motorized {

    // Class properties
    private String load;
    private boolean towingEnabled;

    // Constructor
    public Truck(
            int wheels,
            String color,
            boolean moving,
            int seats,
            String engine,
            boolean automatic,
            String load,
            boolean towingEnabled) {

        // Call the Motorized constructor
        super(wheels, color, moving, seats, engine, automatic);

        this.load = load;
        this.towingEnabled = towingEnabled;
    }

    // Getters and setters

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public boolean isTowingEnabled() {
        return towingEnabled;
    }

    public void setTowingEnabled(boolean towingEnabled) {
        this.towingEnabled = towingEnabled;
    }

    // Return all Motorized and Truck properties
    @Override
    public String toString() {
        return String.format(
                "%s%n"
                        + "Load Capacity: %s%n"
                        + "Towing Enabled: %s",
                super.toString(),
                load,
                towingEnabled
        );
    }
}