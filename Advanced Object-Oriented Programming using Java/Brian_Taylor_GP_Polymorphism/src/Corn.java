/*******************************************************************
 * Name: Brian Taylor
 * Date: August 5, 2026
 * Assignment: SDC330 Week 2 GP – Polymorphism
 *
 * Extends the Vegetable class. Override of toString() provided for
 * formatted output of class information. All properties are private
 * - getters and setters are provided for all properties. Constructor
 * sets all properties to provided values.
 */

public class Corn extends Vegetable {

    private String Variety;
    private String Packaging;

    // Note that the "name" parameter is omitted from the constructor.
    // A custom name is passed into the superclass constructor using
    // the variety plus the word "Corn."

    public Corn(
        String servingSize,
        String plantingSeason,
        String harvestSeason,
        String variety,
        String packaging
    ) {
        super(
            variety + " Corn",
            servingSize,
            plantingSeason,
            harvestSeason
        );

        Variety = variety;
        Packaging = packaging;
    }

    public String getVariety() {
        return Variety;
    }

    public void setVariety(String variety) {
        Variety = variety;
    }

    public String getPackaging() {
        return Packaging;
    }

    public void setPackaging(String packaging) {
        Packaging = packaging;
    }

    @Override
    public String toString() {
        return String.format(
            "%sType of Corn: %s%nPackage Description: %s%n",
            super.toString(),
            Variety,
            Packaging
        );
    }
}