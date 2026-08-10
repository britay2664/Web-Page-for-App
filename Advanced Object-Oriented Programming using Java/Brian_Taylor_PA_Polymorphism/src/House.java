/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Performance Assessment - Polymorphism
 *
 * House extends Building and adds the house color and number of
 * rooms. It overrides toString() to include Building information
 * followed by House information.
 */

public class House extends Building {

    private String Color;
    private int NumRooms;

    public House(String streetAddress, int numFloors,
            String exteriorMaterial, String color, int numRooms) {

        super(streetAddress, numFloors, exteriorMaterial);

        Color = color;
        NumRooms = numRooms;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getNumRooms() {
        return NumRooms;
    }

    public void setNumRooms(int numRooms) {
        NumRooms = numRooms;
    }

    @Override
    public String toString() {
        return String.format(
            "%sIt is a house that contains %d rooms.%n",
            super.toString(),
            NumRooms
        );
    }
}