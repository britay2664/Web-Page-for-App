package gymtracker;

import java.util.ArrayList;
import java.util.Scanner;

/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Course Project - Phase 1
 *
 * Purpose:
 * This is the main application class for the Gym Progress Tracker.
 * It controls the program menu and allows the user to add workout
 * sessions, view workout history, review exercise progress, and
 * calculate workout volume.
 *******************************************************************/

public class GymProgressTrackerApp {

    private static ArrayList<WorkoutSession> workoutHistory =
            new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean running = true;

        System.out.println("==========================================");
        System.out.println("          GYM PROGRESS TRACKER");
        System.out.println("            Brian Taylor");
        System.out.println("==========================================");

        while (running) {

            displayMenu();

            System.out.print("Enter your selection: ");
            String selection = input.nextLine();

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

                case "0":
                    exitProgram();
                    running = false;
                    break;

                default:
                    System.out.println(
                            "Invalid selection. Please choose 0 through 4.");
            }
        }

        input.close();
    }

    public static void displayMenu() {

        System.out.println();
        System.out.println("--------------- Main Menu ---------------");
        System.out.println("1. Add Workout");
        System.out.println("2. View Workout History");
        System.out.println("3. View Progress");
        System.out.println("4. Calculate Workout Volume");
        System.out.println("0. Exit");
        System.out.println("-----------------------------------------");
    }

    public static void addWorkout(Scanner input) {

        System.out.println();
        System.out.println("--------------- Add Workout ---------------");

        System.out.print("Enter workout date: ");
        String workoutDate = input.nextLine();

        System.out.print("Enter workout name: ");
        String workoutName = input.nextLine();

        WorkoutSession workout =
                new WorkoutSession(workoutDate, workoutName);

        boolean addingExercises = true;

        while (addingExercises) {

            System.out.println();
            System.out.println("1. Add Strength Exercise");
            System.out.println("2. Add Cardio Exercise");
            System.out.println("3. Finish Workout");

            System.out.print("Enter your choice: ");
            String exerciseChoice = input.nextLine();

            switch (exerciseChoice) {

                case "1":

                    System.out.print("Exercise name: ");
                    String strengthName = input.nextLine();

                    System.out.print("Muscle group: ");
                    String muscleGroup = input.nextLine();

                    System.out.print("Sets: ");
                    int sets = Integer.parseInt(input.nextLine());

                    System.out.print("Reps: ");
                    int reps = Integer.parseInt(input.nextLine());

                    System.out.print("Weight: ");
                    double weight =
                            Double.parseDouble(input.nextLine());

                    StrengthExercise strengthExercise =
                            new StrengthExercise(
                                    strengthName,
                                    muscleGroup,
                                    sets,
                                    reps,
                                    weight);

                    workout.addExercise(strengthExercise);

                    System.out.println(
                            "Strength exercise added.");

                    break;

                case "2":

                    System.out.print("Exercise name: ");
                    String cardioName = input.nextLine();

                    System.out.print("Muscle group: ");
                    String cardioGroup = input.nextLine();

                    System.out.print("Duration in minutes: ");
                    int duration =
                            Integer.parseInt(input.nextLine());

                    System.out.print("Distance in miles: ");
                    double distance =
                            Double.parseDouble(input.nextLine());

                    CardioExercise cardioExercise =
                            new CardioExercise(
                                    cardioName,
                                    cardioGroup,
                                    duration,
                                    distance);

                    workout.addExercise(cardioExercise);

                    System.out.println(
                            "Cardio exercise added.");

                    break;

                case "3":
                    addingExercises = false;
                    break;

                default:
                    System.out.println(
                            "Invalid exercise selection.");
            }
        }

        workoutHistory.add(workout);

        System.out.println();
        System.out.println("Workout saved successfully.");
    }

    public static void viewWorkoutHistory() {

        System.out.println();
        System.out.println("------------- Workout History -------------");

        if (workoutHistory.isEmpty()) {

            System.out.println(
                    "No workouts have been recorded.");

            return;
        }

        for (int i = 0; i < workoutHistory.size(); i++) {

            System.out.println();
            System.out.println("Workout #" + (i + 1));

            workoutHistory.get(i).displayWorkout();
        }
    }

    public static void viewProgress() {

        System.out.println();
        System.out.println("--------------- Progress ----------------");

        if (workoutHistory.isEmpty()) {

            System.out.println(
                    "No workouts available.");

            return;
        }

        for (WorkoutSession workout : workoutHistory) {

            for (Exercise exercise : workout.getExercises()) {

                if (exercise instanceof ProgressTrackable) {

                    ProgressTrackable trackable =
                            (ProgressTrackable) exercise;

                    System.out.println(
                            trackable.getProgressSummary());
                }
            }
        }
    }

    public static void calculateWorkoutVolume() {

        System.out.println();
        System.out.println("------------ Workout Volume ------------");

        if (workoutHistory.isEmpty()) {

            System.out.println(
                    "No workouts available.");

            return;
        }

        for (WorkoutSession workout : workoutHistory) {

            double totalVolume = 0;

            for (Exercise exercise : workout.getExercises()) {

                if (exercise instanceof StrengthExercise) {

                    StrengthExercise strength =
                            (StrengthExercise) exercise;

                    double exerciseVolume =
                            strength.getSets()
                            * strength.getReps()
                            * strength.getWeight();

                    totalVolume += exerciseVolume;
                }
            }

            System.out.println(
                    workout.getWorkoutName()
                    + " - Total Volume: "
                    + String.format("%.2f", totalVolume)
                    + " lbs");
        }
    }

    public static void exitProgram() {

        System.out.println();
        System.out.println(
                "Thank you for using the Gym Progress Tracker!");

        System.out.println(
                "Stay consistent and keep making progress!");
    }
}