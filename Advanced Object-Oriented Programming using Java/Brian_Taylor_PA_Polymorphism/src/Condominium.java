/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Performance Assessment - Polymorphism
 *
 * Condominium extends Building and adds the number of condominium
 * units. It overrides toString() to include both Building and
 * Condominium information.
 */

public class Condominium extends Building {

    private int NumUnits;

    public Condominium(String streetAddress, int numFloors,
            String exteriorMaterial, int numUnits) {

        super(streetAddress, numFloors, exteriorMaterial);

        NumUnits = numUnits;
    }

    public int getNumUnits() {
        return NumUnits;
    }

    public void setNumUnits(int numUnits) {
        NumUnits = numUnits;
    }

    @Override
    public String toString() {
        return String.format(
            "%sIt is a condominium that contains %d units.%n",
            super.toString(),
            NumUnits
        );
    }
}