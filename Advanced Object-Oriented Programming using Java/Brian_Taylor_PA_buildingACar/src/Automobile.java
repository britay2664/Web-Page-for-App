/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Composition
 *
 * This class represents an Automobile object. It stores the make,
 * model, color, body style, an Engine object, and a collection of
 * Tire objects. This class demonstrates composition because an
 * Automobile has one Engine and has multiple Tires. Methods are
 * provided to add tires, retrieve basic information, and return all
 * automobile information in a formatted string.
 *******************************************************************/

import java.util.ArrayList;

public class Automobile {

    // Class properties
    private String make;
    private String model;
    private String color;
    private String bodyStyle;
    private Engine engineInfo;
    private ArrayList<Tire> tires;

    // Constructor
    public Automobile(
            String make,
            String model,
            String color,
            String bodyStyle,
            Engine engineInfo) {

        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyStyle = bodyStyle;
        this.engineInfo = engineInfo;

        // Each automobile begins with an empty tire collection
        this.tires = new ArrayList<Tire>();
    }

    // Getters and setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public Engine getEngineInfo() {
        return engineInfo;
    }

    public void setEngineInfo(Engine engineInfo) {
        this.engineInfo = engineInfo;
    }

    public ArrayList<Tire> getTires() {
        return tires;
    }

    public void setTires(ArrayList<Tire> tires) {
        this.tires = tires;
    }

    // Add an already-created Tire object
    public void addTire(Tire tire) {
        tires.add(tire);
    }

    // Create and add a Tire object using parameter values
    public void addTire(
            String manufacturer,
            String size,
            int maxPressure,
            int minPressure,
            String type) {

        Tire tire = new Tire(
                manufacturer,
                size,
                maxPressure,
                minPressure,
                type
        );

        tires.add(tire);
    }

    /*
     * Return the required basic automobile information:
     * make, model, color, cylinder count, fuel injection status,
     * and number of tires.
     */
    public String getBasicInfo() {
        return String.format(
                "Make: %s%n"
                        + "Model: %s%n"
                        + "Color: %s%n"
                        + "Engine Cylinder Count: %d%n"
                        + "Fuel Injected: %s%n"
                        + "Number of Tires: %d",
                make,
                model,
                color,
                engineInfo.getCylinders(),
                engineInfo.isFuelInjected(),
                tires.size()
        );
    }

    // Return all information about the automobile
    @Override
    public String toString() {

        String result = String.format(
                "Make: %s%n"
                        + "Model: %s%n"
                        + "Color: %s%n"
                        + "Body Style: %s%n"
                        + "%nEngine Information:%n"
                        + "%s%n"
                        + "%nNumber of Tires: %d%n",
                make,
                model,
                color,
                bodyStyle,
                engineInfo.toString(),
                tires.size()
        );

        result += "\nTire Information:\n";

        if (tires.isEmpty()) {
            result += "No tires have been added.\n";
        } else {
            int tireNumber = 1;

            for (Tire tire : tires) {
                result += String.format(
                        "%nTire %d:%n%s%n",
                        tireNumber,
                        tire.toString()
                );

                tireNumber++;
            }
        }

        return result;
    }
}