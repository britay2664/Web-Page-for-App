package gymtracker;

/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * 
 *
 * Purpose:
 * This class represents a cardio exercise. It inherits common
 * exercise information from Exercise and adds cardio-specific
 * information including duration and distance.
 *******************************************************************/

public class CardioExercise extends Exercise
        implements ProgressTrackable {

    // Private properties
    private int durationMinutes;
    private double distanceMiles;

    /*
     * DEFAULT CONSTRUCTOR
     */
    public CardioExercise() {
        super();

        this.durationMinutes = 0;
        this.distanceMiles = 0.0;
    }

    /*
     * FULL PARAMETERIZED CONSTRUCTOR
     */
    public CardioExercise(
            String name,
            String muscleGroup,
            int durationMinutes,
            double distanceMiles) {

        super(name, muscleGroup);

        this.durationMinutes = durationMinutes;
        this.distanceMiles = distanceMiles;
    }

    // Getters
    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double getDistanceMiles() {
        return distanceMiles;
    }

    // Setters
    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setDistanceMiles(double distanceMiles) {
        this.distanceMiles = distanceMiles;
    }

    /*
     * ABSTRACTION:
     * Required by the abstract Exercise class.
     */
    @Override
    public String getExerciseDetails() {
        return String.format(
                "Duration: %d minutes%n"
                + "Distance: %.2f miles",
                durationMinutes,
                distanceMiles
        );
    }

    /*
     * INTERFACE IMPLEMENTATION from Week 2.
     */
    @Override
    public String getProgressSummary() {
        return String.format(
                "%s Progress: %d minutes covering %.2f miles",
                getName(),
                durationMinutes,
                distanceMiles
        );
    }
}