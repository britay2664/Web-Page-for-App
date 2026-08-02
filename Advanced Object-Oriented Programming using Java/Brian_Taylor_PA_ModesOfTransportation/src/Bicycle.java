/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 *
 * This class represents a Bicycle object. It extends Vehicle by
 * adding the number of gears, seat height, and tire size. Its
 * toString method calls the Vehicle class's toString method before
 * adding the Bicycle properties.
 *******************************************************************/

public class Bicycle extends Vehicle {

    // Class properties
    private int gears;
    private double seatHeight;
    private double tireSize;

    // Constructor
    public Bicycle(
            int wheels,
            String color,
            boolean moving,
            int seats,
            int gears,
            double seatHeight,
            double tireSize) {

        // Call the Vehicle constructor
        super(wheels, color, moving, seats);

        this.gears = gears;
        this.seatHeight = seatHeight;
        this.tireSize = tireSize;
    }

    // Getters and setters

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public double getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(double seatHeight) {
        this.seatHeight = seatHeight;
    }

    public double getTireSize() {
        return tireSize;
    }

    public void setTireSize(double tireSize) {
        this.tireSize = tireSize;
    }

    /*
     * The assignment requires Bicycle to use the superclass
     * toString method when displaying the Vehicle properties.
     */
    @Override
    public String toString() {
        return String.format(
                "%s%n"
                        + "Number of Gears: %d%n"
                        + "Seat Height: %.2f inches%n"
                        + "Tire Size: %.2f inches",
                super.toString(),
                gears,
                seatHeight,
                tireSize
        );
    }
}