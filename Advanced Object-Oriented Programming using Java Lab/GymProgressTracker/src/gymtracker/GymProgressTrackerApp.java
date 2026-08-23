package gymtracker;

/*******************************************************************
 * Name: Brian Taylor
 * Date: August 23, 2026
 * Assignment: SDC330 Course Project - Phase 4
 *
 * Purpose:
 * This is the main application for the Gym Progress Tracker.
 * It allows the user to add, view, update, and delete workout
 * records stored in a SQLite database.
 *
 * The application continues to demonstrate abstraction,
 * constructors, access specifiers, inheritance, interfaces,
 * composition, and polymorphism from previous project phases.
 *******************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class GymProgressTrackerApp {

    /*
     * Private because the workout history is only managed by
     * the main application class.
     */
    private static ArrayList<WorkoutSession> workoutHistory =
            new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create SQLite tables if needed.
        DatabaseManager.createTables();

        // READ existing data when the application starts.
        workoutHistory =
                DatabaseManager.loadWorkouts();

        System.out.println();
        System.out.println(
                "==================================================");
        System.out.println(
                "       GYM PROGRESS TRACKER - PROJECT WEEK 4");
        System.out.println(
                "                  Brian Taylor");
        System.out.println(
                "==================================================");

        System.out.println();
        System.out.println(
                "Welcome to the Gym Progress Tracker!");

        System.out.println(
                "Use the menu to add, view, update, or delete "
                        + "workout records.");

        boolean running = true;

        while (running) {

            displayMenu();

            System.out.print(
                    "Enter your selection: ");

            String selection =
                    input.nextLine();

            switch (selection) {

                case "1":
                    addWorkout(input);
                    break;

                case "2":
                    viewWorkoutHistory();
                    break;

                case "3":
                    viewProgress();
                    break;

                case "4":
                    calculateWorkoutVolume();
                    break;

                case "5":
                    updateWorkout(input);
                    break;

                case "6":
                    deleteWorkout(input);
                    break;

                case "0":
                    running = false;

                    System.out.println();
                    System.out.println(
                            "Thank you for using the "
                                    + "Gym Progress Tracker!");
                    break;

                default:
                    System.out.println(
                            "Invalid selection. "
                                    + "Please choose 0 through 6.");
                    break;
            }
        }

        input.close();
    }

    /*
     * Private because this menu is only used by this class.
     * This demonstrates appropriate use of access specifiers.
     */
    private static void displayMenu() {

        System.out.println();
        System.out.println(
                "---------------- Main Menu ----------------");
        System.out.println(
                "1. Add Workout");
        System.out.println(
                "2. View Workout History");
        System.out.println(
                "3. View Progress");
        System.out.println(
                "4. Calculate Workout Volume");
        System.out.println(
                "5. Update Workout");
        System.out.println(
                "6. Delete Workout");
        System.out.println(
                "0. Exit");
        System.out.println(
                "-------------------------------------------");
    }

    /*
     * CREATE OPERATION:
     * Creates a WorkoutSession and saves it to SQLite.
     */
    private static void addWorkout(Scanner input) {

        System.out.println();
        System.out.println(
                "--------------- Add Workout ---------------");

        System.out.print(
                "Enter workout date (MM/DD/YYYY): ");

        String workoutDate =
                input.nextLine();

        System.out.print(
                "Enter workout name: ");

        String workoutName =
                input.nextLine();

        /*
         * PARAMETERIZED CONSTRUCTOR:
         * Creates a realistic workout using information entered
         * by the user.
         */
        WorkoutSession workout =
                new WorkoutSession(
                        workoutDate,
                        workoutName);

        boolean addingExercises = true;

        while (addingExercises) {

            System.out.println();
            System.out.println(
                    "Add Exercise");
            System.out.println(
                    "1. Strength Exercise");
            System.out.println(
                    "2. Cardio Exercise");
            System.out.println(
                    "0. Finish Workout");

            System.out.print(
                    "Enter selection: ");

            String choice =
                    input.nextLine();

            switch (choice) {

                case "1":
                    addStrengthExercise(
                            input,
                            workout);
                    break;

                case "2":
                    addCardioExercise(
                            input,
                            workout);
                    break;

                case "0":
                    addingExercises = false;
                    break;

                default:
                    System.out.println(
                            "Invalid exercise selection.");
                    break;
            }
        }

        /*
         * CREATE:
         * Save the new workout and its exercises to SQLite.
         */
        DatabaseManager.saveWorkout(workout);

        /*
         * Reload from the database so memory and SQLite remain
         * synchronized.
         */
        workoutHistory =
                DatabaseManager.loadWorkouts();

        System.out.println();
        System.out.println(
                "Workout saved successfully.");
    }

    /*
     * Creates and adds a StrengthExercise.
     */
    private static void addStrengthExercise(
            Scanner input,
            WorkoutSession workout) {

        System.out.println();
        System.out.println(
                "----------- Strength Exercise -----------");

        System.out.print(
                "Exercise name: ");
        String name =
                input.nextLine();

        System.out.print(
                "Muscle group: ");
        String muscleGroup =
                input.nextLine();

        System.out.print(
                "Number of sets: ");
        int sets =
                Integer.parseInt(
                        input.nextLine());

        System.out.print(
                "Repetitions per set: ");
        int reps =
                Integer.parseInt(
                        input.nextLine());

        System.out.print(
                "Weight in pounds: ");
        double weight =
                Double.parseDouble(
                        input.nextLine());

        /*
         * ABSTRACTION/INHERITANCE:
         * StrengthExercise is a specific implementation of the
         * abstract Exercise base class.
         */
        StrengthExercise exercise =
                new StrengthExercise(
                        name,
                        muscleGroup,
                        sets,
                        reps,
                        weight);

        workout.addExercise(exercise);

        System.out.println(
                "Strength exercise added.");
    }

    /*
     * Creates and adds a CardioExercise.
     */
    private static void addCardioExercise(
            Scanner input,
            WorkoutSession workout) {

        System.out.println();
        System.out.println(
                "------------ Cardio Exercise ------------");

        System.out.print(
                "Exercise name: ");
        String name =
                input.nextLine();

        System.out.print(
                "Muscle group/category: ");
        String muscleGroup =
                input.nextLine();

        System.out.print(
                "Duration in minutes: ");
        int duration =
                Integer.parseInt(
                        input.nextLine());

        System.out.print(
                "Distance in miles: ");
        double distance =
                Double.parseDouble(
                        input.nextLine());

        CardioExercise exercise =
                new CardioExercise(
                        name,
                        muscleGroup,
                        duration,
                        distance);

        workout.addExercise(exercise);

        System.out.println(
                "Cardio exercise added.");
    }

    /*
     * READ OPERATION:
     * Displays workouts loaded from SQLite.
     */
    private static void viewWorkoutHistory() {

        System.out.println();
        System.out.println(
                "-------------- Workout History --------------");

        workoutHistory =
                DatabaseManager.loadWorkouts();

        if (workoutHistory.isEmpty()) {

            System.out.println(
                    "No workouts have been saved.");

            return;
        }

        int workoutNumber = 1;

        for (WorkoutSession workout :
                workoutHistory) {

            System.out.println();
            System.out.println(
                    "Workout #" + workoutNumber);

            System.out.println(workout);

            workoutNumber++;
        }
    }

    /*
     * Demonstrates polymorphism using the ProgressTrackable
     * interface. Strength and cardio exercises provide their own
     * implementations of getProgressSummary().
     */
    private static void viewProgress() {

        System.out.println();
        System.out.println(
                "-------------- Progress Summary --------------");

        if (workoutHistory.isEmpty()) {

            System.out.println(
                    "No workout information is available.");

            return;
        }

        for (WorkoutSession workout :
                workoutHistory) {

            for (Exercise exercise :
                    workout.getExercises()) {

                if (exercise
                        instanceof ProgressTrackable) {

                    ProgressTrackable trackable =
                            (ProgressTrackable) exercise;

                    System.out.println(
                            trackable.getProgressSummary());
                }
            }
        }
    }

    /*
     * Calculates total strength-training volume.
     *
     * Volume = sets x reps x weight
     */
    private static void calculateWorkoutVolume() {

        System.out.println();
        System.out.println(
                "------------ Workout Volume ------------");

        double totalVolume = 0.0;

        for (WorkoutSession workout :
                workoutHistory) {

            for (Exercise exercise :
                    workout.getExercises()) {

                if (exercise
                        instanceof StrengthExercise) {

                    StrengthExercise strength =
                            (StrengthExercise) exercise;

                    totalVolume +=
                            strength.getSets()
                                    * strength.getReps()
                                    * strength.getWeight();
                }
            }
        }

        System.out.printf(
                "Total Strength Training Volume: %.1f lbs%n",
                totalVolume);
    }

    /*
     * UPDATE OPERATION:
     * Allows an existing SQLite workout record to be modified.
     */
    private static void updateWorkout(
            Scanner input) {

        System.out.println();
        System.out.println(
                "-------------- Update Workout --------------");

        // READ records so the user can select an ID.
        DatabaseManager.displayWorkoutRecords();

        System.out.print(
                "Enter the workout ID to update: ");

        int workoutId =
                Integer.parseInt(
                        input.nextLine());

        System.out.print(
                "Enter the new workout date: ");

        String newDate =
                input.nextLine();

        System.out.print(
                "Enter the new workout name: ");

        String newName =
                input.nextLine();

        boolean updated =
                DatabaseManager.updateWorkout(
                        workoutId,
                        newDate,
                        newName);

        if (updated) {

            System.out.println(
                    "Workout updated successfully.");

            workoutHistory =
                    DatabaseManager.loadWorkouts();

            // Display the updated database information.
            DatabaseManager.displayWorkoutRecords();

        } else {

            System.out.println(
                    "Workout ID was not found.");
        }
    }

    /*
     * DELETE OPERATION:
     * Removes a workout and its exercises from SQLite.
     */
    private static void deleteWorkout(
            Scanner input) {

        System.out.println();
        System.out.println(
                "-------------- Delete Workout --------------");

        // READ records so the user can select an ID.
        DatabaseManager.displayWorkoutRecords();

        System.out.print(
                "Enter the workout ID to delete: ");

        int workoutId =
                Integer.parseInt(
                        input.nextLine());

        System.out.print(
                "Are you sure you want to delete "
                        + "this workout? (Y/N): ");

        String confirmation =
                input.nextLine();

        if (!confirmation.equalsIgnoreCase("Y")) {

            System.out.println(
                    "Delete cancelled.");

            return;
        }

        boolean deleted =
                DatabaseManager.deleteWorkout(
                        workoutId);

        if (deleted) {

            System.out.println(
                    "Workout deleted successfully.");

            workoutHistory =
                    DatabaseManager.loadWorkouts();

            // Display remaining database records.
            DatabaseManager.displayWorkoutRecords();

        } else {

            System.out.println(
                    "Workout ID was not found.");
        }
    }
}