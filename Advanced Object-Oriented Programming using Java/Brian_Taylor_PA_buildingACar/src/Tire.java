/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Composition
 *
 * This class represents an automobile tire. It stores the tire
 * manufacturer, size, maximum pressure, minimum pressure, and tire
 * type. Public getters and setters provide access to the private
 * properties. The toString method returns formatted tire details.
 *******************************************************************/

public class Tire {

    // Private class properties
    private String manufacturer;
    private String size;
    private int maxPressure;
    private int minPressure;
    private String type;

    // Five-parameter constructor
    public Tire(
            String manufacturer,
            String size,
            int maxPressure,
            int minPressure,
            String type) {

        this.manufacturer = manufacturer;
        this.size = size;
        this.maxPressure = maxPressure;
        this.minPressure = minPressure;
        this.type = type;
    }

    // Manufacturer getter and setter
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Size getter and setter
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Maximum pressure getter and setter
    public int getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(int maxPressure) {
        this.maxPressure = maxPressure;
    }

    // Minimum pressure getter and setter
    public int getMinPressure() {
        return minPressure;
    }

    public void setMinPressure(int minPressure) {
        this.minPressure = minPressure;
    }

    // Tire type getter and setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Return all tire information in a formatted string
    @Override
    public String toString() {
        return String.format(
                "Manufacturer: %s%n"
                        + "Tire Size: %s%n"
                        + "Maximum Pressure: %d PSI%n"
                        + "Minimum Pressure: %d PSI%n"
                        + "Tire Type: %s",
                manufacturer,
                size,
                maxPressure,
                minPressure,
                type
        );
    }
}