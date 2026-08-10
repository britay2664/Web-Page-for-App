/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Performance Assessment - Polymorphism
 *
 * SplitLevel extends House and adds an indicator showing whether the
 * house has entry-level living space. Split-level houses automatically
 * have the Building NumFloors property set to 2.
 */

public class SplitLevel extends House {

    private boolean EntryLevelLivingSpace;

    public SplitLevel(String streetAddress,
            String exteriorMaterial,
            String color,
            int numRooms,
            boolean entryLevelLivingSpace) {

        super(
            streetAddress,
            2,
            exteriorMaterial,
            color,
            numRooms
        );

        EntryLevelLivingSpace = entryLevelLivingSpace;
    }

    public boolean getEntryLevelLivingSpace() {
        return EntryLevelLivingSpace;
    }

    public void setEntryLevelLivingSpace(
            boolean entryLevelLivingSpace) {

        EntryLevelLivingSpace = entryLevelLivingSpace;
    }

    @Override
    public String toString() {

        String livingSpaceText;

        if (EntryLevelLivingSpace) {
            livingSpaceText = "has";
        } else {
            livingSpaceText = "does not have";
        }

        return String.format(
            "%sIt is a Split-Level that %s entry level living space.%n",
            super.toString(),
            livingSpaceText
        );
    }
}