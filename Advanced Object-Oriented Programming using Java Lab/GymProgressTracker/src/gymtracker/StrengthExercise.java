package gymtracker;

/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Project Week 3
 *
 * Purpose:
 * This class represents a strength-training exercise. It inherits
 * common exercise information from Exercise and provides
 * strength-specific information including sets, reps, and weight.
 *******************************************************************/

public class StrengthExercise extends Exercise
        implements ProgressTrackable {

    // Private properties protect the class data
    private int sets;
    private int reps;
    private double weight;

    /*
     * DEFAULT CONSTRUCTOR
     */
    public StrengthExercise() {
        super();

        this.sets = 0;
        this.reps = 0;
        this.weight = 0.0;
    }

    /*
     * FULL PARAMETERIZED CONSTRUCTOR
     */
    public StrengthExercise(
            String name,
            String muscleGroup,
            int sets,
            int reps,
            double weight) {

        super(name, muscleGroup);

        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }

    // Getters
    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public double getWeight() {
        return weight;
    }

    // Setters
    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /*
     * ABSTRACTION:
     * Exercise requires every subclass to implement this method.
     */
    @Override
    public String getExerciseDetails() {
        return String.format(
                "Sets: %d%n"
                + "Reps: %d%n"
                + "Weight: %.1f lbs",
                sets,
                reps,
                weight
        );
    }

    /*
     * INTERFACE IMPLEMENTATION from Week 2.
     */
    @Override
    public String getProgressSummary() {
        return String.format(
                "%s Progress: %d sets x %d reps at %.1f lbs",
                getName(),
                sets,
                reps,
                weight
        );
    }
}