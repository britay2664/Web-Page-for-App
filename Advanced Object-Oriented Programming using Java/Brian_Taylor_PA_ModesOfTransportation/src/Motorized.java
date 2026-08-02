/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 *
 * This class represents a Motorized vehicle. It extends Vehicle by
 * adding an engine description and an indicator of whether the
 * transmission is automatic. Its toString method uses inherited
 * getter methods instead of calling the Vehicle toString method.
 *******************************************************************/

public class Motorized extends Vehicle {

    // Class properties
    private String engine;
    private boolean automatic;

    // Constructor
    public Motorized(
            int wheels,
            String color,
            boolean moving,
            int seats,
            String engine,
            boolean automatic) {

        // Call the Vehicle constructor
        super(wheels, color, moving, seats);

        this.engine = engine;
        this.automatic = automatic;
    }

    // Getters and setters

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    /*
     * The assignment specifically says not to use super.toString()
     * here. Instead, inherited getter methods are used to obtain
     * the Vehicle properties.
     */
    @Override
    public String toString() {
        return String.format(
                "Number of Wheels: %d%n"
                        + "Color: %s%n"
                        + "Currently Moving: %s%n"
                        + "Number of Seats: %d%n"
                        + "Engine Size: %s%n"
                        + "Automatic Transmission: %s",
                getWheels(),
                getColor(),
                isMoving(),
                getSeats(),
                engine,
                automatic
        );
    }
}