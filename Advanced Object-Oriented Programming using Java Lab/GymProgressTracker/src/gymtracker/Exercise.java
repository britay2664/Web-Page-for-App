package gymtracker;

/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * 
 *
 * Purpose:
 * This abstract class represents a general exercise in the Gym
 * Progress Tracker. It stores information shared by all exercise
 * types and requires derived classes to provide their own
 * exercise-specific details.
 *******************************************************************/

public abstract class Exercise {

    /*
     * ACCESS SPECIFIERS:
     * These properties are private because they should only be
     * accessed directly inside the Exercise class.
     */
    private String name;
    private String muscleGroup;

    /*
     * DEFAULT CONSTRUCTOR:
     * Allows an Exercise subclass to be created without initially
     * providing values.
     */
    public Exercise() {
        this.name = "Unknown Exercise";
        this.muscleGroup = "Unknown";
    }

    /*
     * PARAMETERIZED CONSTRUCTOR:
     * Allows subclasses to provide realistic exercise information.
     */
    public Exercise(String name, String muscleGroup) {
        this.name = name;
        this.muscleGroup = muscleGroup;
    }

    // Public getters
    public String getName() {
        return name;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    // Public setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    /*
     * PROTECTED METHOD:
     * This method is intended to be used by Exercise subclasses.
     * It does not need to be called directly from the main program.
     */
    protected String getBasicExerciseInfo() {
        return String.format(
                "Exercise: %s%n"
                + "Muscle Group: %s",
                name,
                muscleGroup
        );
    }

    /*
     * ABSTRACTION:
     * Every type of Exercise must provide its own implementation
     * because strength and cardio exercises contain different data.
     */
    public abstract String getExerciseDetails();

    /*
     * Uses the abstract method. Java will call the correct version
     * depending on the actual subclass object.
     */
    @Override
    public String toString() {
        return String.format(
                "%s%n%s",
                getBasicExerciseInfo(),
                getExerciseDetails()
        );
    }
}