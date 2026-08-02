/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 *
 * This class represents a Car object. It extends the Motorized
 * class by adding an indicator of whether the car has a sunroof
 * and a description of its storage capacity. Getters and setters
 * provide public access to the private properties. The toString
 * method returns all inherited and Car properties.
 *******************************************************************/

public class Car extends Motorized {

    // Class properties
    private boolean sunRoof;
    private String storage;

    // Constructor
    public Car(
            int wheels,
            String color,
            boolean moving,
            int seats,
            String engine,
            boolean automatic,
            boolean sunRoof,
            String storage) {

        // Call the Motorized constructor
        super(wheels, color, moving, seats, engine, automatic);

        this.sunRoof = sunRoof;
        this.storage = storage;
    }

    // Getters and setters

    public boolean hasSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    // Return all Motorized and Car properties
    @Override
    public String toString() {
        return String.format(
                "%s%n"
                        + "Sun Roof: %s%n"
                        + "Storage Capacity: %s",
                super.toString(),
                sunRoof,
                storage
        );
    }
}