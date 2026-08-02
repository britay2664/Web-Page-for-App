/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 *
 * This class represents a general Vehicle object. It is the overall
 * superclass for the Bicycle and Motorized classes. It stores the
 * number of wheels, vehicle color, moving status, and number of
 * available seats. Getters and setters provide public access to the
 * private properties. The toString method returns all vehicle data
 * in a formatted string.
 *******************************************************************/

public class Vehicle {

    // Class properties
    private int wheels;
    private String color;
    private boolean moving;
    private int seats;

    // Constructor
    public Vehicle(int wheels, String color, boolean moving, int seats) {
        this.wheels = wheels;
        this.color = color;
        this.moving = moving;
        this.seats = seats;
    }

    // Getters and setters

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    // Return a formatted string containing all Vehicle properties
    @Override
    public String toString() {
        return String.format(
                "Number of Wheels: %d%n"
                        + "Color: %s%n"
                        + "Currently Moving: %s%n"
                        + "Number of Seats: %d",
                wheels,
                color,
                moving,
                seats
        );
    }
}