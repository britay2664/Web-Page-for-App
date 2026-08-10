/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Performance Assessment - Polymorphism
 *
 * Building is the superclass for the building hierarchy. It stores
 * the street address, number of floors, and exterior material for
 * a building and provides getters, setters, and formatted output.
 */

public class Building {

    private String StreetAddress;
    private int NumFloors;
    private String ExteriorMaterial;

    public Building(String streetAddress, int numFloors,
            String exteriorMaterial) {

        StreetAddress = streetAddress;
        NumFloors = numFloors;
        ExteriorMaterial = exteriorMaterial;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        StreetAddress = streetAddress;
    }

    public int getNumFloors() {
        return NumFloors;
    }

    public void setNumFloors(int numFloors) {
        NumFloors = numFloors;
    }

    public String getExteriorMaterial() {
        return ExteriorMaterial;
    }

    public void setExteriorMaterial(String exteriorMaterial) {
        ExteriorMaterial = exteriorMaterial;
    }

    @Override
    public String toString() {
        return String.format(
            ">> There is a %d story building at %s made of %s.%n",
            NumFloors,
            StreetAddress,
            ExteriorMaterial
        );
    }
}