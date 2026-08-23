package gymtracker;

import java.util.ArrayList;

/*
 * Name: Brian Taylor
 * Date: August 1, 2026
 * Purpose: This class represents a complete workout session.
 * It demonstrates composition by containing a collection of
 * Exercise objects.
 */

public class WorkoutSession {

    private String workoutDate;
    private String workoutName;

    /*
     * Composition is demonstrated here.
     * A WorkoutSession contains Exercise objects.
     */
    private ArrayList<Exercise> exercises;

    public WorkoutSession(String workoutDate, String workoutName) {
        this.workoutDate = workoutDate;
        this.workoutName = workoutName;
        this.exercises = new ArrayList<>();
    }

    public String getWorkoutDate() {
        return workoutDate;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public ArrayList<Exercise> getExercises() {
    return exercises;
}

    public int getExerciseCount() {
        return exercises.size();
    }

    public void displayWorkout() {
        System.out.println();
        System.out.println("==================================================");
        System.out.println("WORKOUT SESSION");
        System.out.println("==================================================");
        System.out.println("Workout Name: " + workoutName);
        System.out.println("Date: " + workoutDate);
        System.out.println("Number of Exercises: " + exercises.size());
        System.out.println();

        for (int index = 0; index < exercises.size(); index++) {
            System.out.println("Exercise #" + (index + 1));
            System.out.println("----------------------------------");

            System.out.println(exercises.get(index));

            System.out.println();
        }

        System.out.println("==================================================");
    }
}