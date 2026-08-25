package gymtracker;

/*******************************************************************
 * Name: Brian Taylor
 * Date: August 23, 2026
 * 
 *
 * Purpose:
 * This class manages the SQLite database for the Gym Progress
 * Tracker. It creates the required database tables and performs
 * Create, Read, Update, and Delete (CRUD) operations on workout
 * and exercise records.
 *******************************************************************/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseManager {

    // Database connection URL
    private static final String DB_URL =
            "jdbc:sqlite:gym_progress_tracker.db";

    /*
     * PRIVATE METHOD:
     * Only DatabaseManager needs to directly create database
     * connections, so this method is private.
     */
    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    /*
     * Creates the database tables if they do not already exist.
     */
    public static void createTables() {

        String workoutTable = """
                CREATE TABLE IF NOT EXISTS workouts (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    workout_date TEXT NOT NULL,
                    workout_name TEXT NOT NULL
                );
                """;

        String exerciseTable = """
                CREATE TABLE IF NOT EXISTS exercises (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    workout_id INTEGER NOT NULL,
                    exercise_type TEXT NOT NULL,
                    exercise_name TEXT NOT NULL,
                    muscle_group TEXT NOT NULL,
                    sets INTEGER,
                    reps INTEGER,
                    weight REAL,
                    duration_minutes INTEGER,
                    distance_miles REAL,
                    FOREIGN KEY (workout_id)
                        REFERENCES workouts(id)
                );
                """;

        try (Connection connection = connect();
             Statement statement = connection.createStatement()) {

            statement.execute(workoutTable);
            statement.execute(exerciseTable);

            System.out.println(
                    "Database initialized successfully.");

        } catch (SQLException e) {

            System.out.println(
                    "Database initialization error: "
                            + e.getMessage());
        }
    }

    /*
     * CREATE:
     * Saves a WorkoutSession to the workouts table and then saves
     * all exercises associated with the workout.
     */
    public static void saveWorkout(WorkoutSession workout) {

        String sql = """
                INSERT INTO workouts
                (workout_date, workout_name)
                VALUES (?, ?);
                """;

        try (Connection connection = connect();
             PreparedStatement statement =
                     connection.prepareStatement(
                             sql,
                             Statement.RETURN_GENERATED_KEYS)) {

            statement.setString(
                    1,
                    workout.getWorkoutDate());

            statement.setString(
                    2,
                    workout.getWorkoutName());

            statement.executeUpdate();

            try (ResultSet keys =
                         statement.getGeneratedKeys()) {

                if (keys.next()) {

                    int workoutId = keys.getInt(1);

                    for (Exercise exercise :
                            workout.getExercises()) {

                        if (exercise
                                instanceof StrengthExercise) {

                            saveStrengthExercise(
                                    connection,
                                    workoutId,
                                    (StrengthExercise) exercise);

                        } else if (exercise
                                instanceof CardioExercise) {

                            saveCardioExercise(
                                    connection,
                                    workoutId,
                                    (CardioExercise) exercise);
                        }
                    }
                }
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error saving workout: "
                            + e.getMessage());
        }
    }

    /*
     * CREATE:
     * Saves a StrengthExercise associated with a workout.
     */
    private static void saveStrengthExercise(
            Connection connection,
            int workoutId,
            StrengthExercise exercise)
            throws SQLException {

        String sql = """
                INSERT INTO exercises
                (workout_id,
                 exercise_type,
                 exercise_name,
                 muscle_group,
                 sets,
                 reps,
                 weight)
                VALUES (?, ?, ?, ?, ?, ?, ?);
                """;

        try (PreparedStatement statement =
                     connection.prepareStatement(sql)) {

            statement.setInt(1, workoutId);
            statement.setString(2, "Strength");
            statement.setString(
                    3,
                    exercise.getName());
            statement.setString(
                    4,
                    exercise.getMuscleGroup());
            statement.setInt(
                    5,
                    exercise.getSets());
            statement.setInt(
                    6,
                    exercise.getReps());
            statement.setDouble(
                    7,
                    exercise.getWeight());

            statement.executeUpdate();
        }
    }

    /*
     * CREATE:
     * Saves a CardioExercise associated with a workout.
     */
    private static void saveCardioExercise(
            Connection connection,
            int workoutId,
            CardioExercise exercise)
            throws SQLException {

        String sql = """
                INSERT INTO exercises
                (workout_id,
                 exercise_type,
                 exercise_name,
                 muscle_group,
                 duration_minutes,
                 distance_miles)
                VALUES (?, ?, ?, ?, ?, ?);
                """;

        try (PreparedStatement statement =
                     connection.prepareStatement(sql)) {

            statement.setInt(1, workoutId);
            statement.setString(2, "Cardio");
            statement.setString(
                    3,
                    exercise.getName());
            statement.setString(
                    4,
                    exercise.getMuscleGroup());
            statement.setInt(
                    5,
                    exercise.getDurationMinutes());
            statement.setDouble(
                    6,
                    exercise.getDistanceMiles());

            statement.executeUpdate();
        }
    }

    /*
     * READ:
     * Loads all workouts and their exercises from SQLite.
     */
    public static ArrayList<WorkoutSession> loadWorkouts() {

        ArrayList<WorkoutSession> workouts =
                new ArrayList<>();

        String workoutSql = """
                SELECT id, workout_date, workout_name
                FROM workouts
                ORDER BY id;
                """;

        try (Connection connection = connect();
             PreparedStatement statement =
                     connection.prepareStatement(workoutSql);
             ResultSet results =
                     statement.executeQuery()) {

            while (results.next()) {

                int workoutId =
                        results.getInt("id");

                String workoutDate =
                        results.getString("workout_date");

                String workoutName =
                        results.getString("workout_name");

                WorkoutSession workout =
                        new WorkoutSession(
                                workoutDate,
                                workoutName);

                loadExercises(
                        connection,
                        workoutId,
                        workout);

                workouts.add(workout);
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error loading workouts: "
                            + e.getMessage());
        }

        return workouts;
    }

    /*
     * READ:
     * Loads all exercises associated with a specific workout.
     */
    private static void loadExercises(
            Connection connection,
            int workoutId,
            WorkoutSession workout)
            throws SQLException {

        String sql = """
                SELECT *
                FROM exercises
                WHERE workout_id = ?
                ORDER BY id;
                """;

        try (PreparedStatement statement =
                     connection.prepareStatement(sql)) {

            statement.setInt(1, workoutId);

            try (ResultSet results =
                         statement.executeQuery()) {

                while (results.next()) {

                    String type =
                            results.getString(
                                    "exercise_type");

                    String name =
                            results.getString(
                                    "exercise_name");

                    String muscleGroup =
                            results.getString(
                                    "muscle_group");

                    if ("Strength".equalsIgnoreCase(type)) {

                        StrengthExercise exercise =
                                new StrengthExercise(
                                        name,
                                        muscleGroup,
                                        results.getInt("sets"),
                                        results.getInt("reps"),
                                        results.getDouble(
                                                "weight"));

                        workout.addExercise(exercise);

                    } else if ("Cardio"
                            .equalsIgnoreCase(type)) {

                        CardioExercise exercise =
                                new CardioExercise(
                                        name,
                                        muscleGroup,
                                        results.getInt(
                                                "duration_minutes"),
                                        results.getDouble(
                                                "distance_miles"));

                        workout.addExercise(exercise);
                    }
                }
            }
        }
    }

    /*
     * READ:
     * Displays basic workout records and their database IDs.
     */
    public static void displayWorkoutRecords() {

        String sql = """
                SELECT id, workout_date, workout_name
                FROM workouts
                ORDER BY id;
                """;

        try (Connection connection = connect();
             PreparedStatement statement =
                     connection.prepareStatement(sql);
             ResultSet results =
                     statement.executeQuery()) {

            System.out.println();
            System.out.println(
                    "------------- Stored Workouts -------------");

            boolean found = false;

            while (results.next()) {

                found = true;

                System.out.println(
                        "ID: "
                                + results.getInt("id")
                                + " | Date: "
                                + results.getString(
                                        "workout_date")
                                + " | Workout: "
                                + results.getString(
                                        "workout_name"));
            }

            if (!found) {
                System.out.println(
                        "No workout records found.");
            }

            System.out.println(
                    "-------------------------------------------");

        } catch (SQLException e) {

            System.out.println(
                    "Error reading workout records: "
                            + e.getMessage());
        }
    }

    /*
     * UPDATE:
     * Updates the date and name of an existing workout.
     */
    public static boolean updateWorkout(
            int workoutId,
            String newDate,
            String newName) {

        String sql = """
                UPDATE workouts
                SET workout_date = ?,
                    workout_name = ?
                WHERE id = ?;
                """;

        try (Connection connection = connect();
             PreparedStatement statement =
                     connection.prepareStatement(sql)) {

            statement.setString(1, newDate);
            statement.setString(2, newName);
            statement.setInt(3, workoutId);

            int rowsUpdated =
                    statement.executeUpdate();

            return rowsUpdated > 0;

        } catch (SQLException e) {

            System.out.println(
                    "Error updating workout: "
                            + e.getMessage());

            return false;
        }
    }

    /*
     * DELETE:
     * Deletes a workout and all exercise records belonging to it.
     */
    public static boolean deleteWorkout(int workoutId) {

        String deleteExercises = """
                DELETE FROM exercises
                WHERE workout_id = ?;
                """;

        String deleteWorkout = """
                DELETE FROM workouts
                WHERE id = ?;
                """;

        try (Connection connection = connect()) {

            /*
             * Delete child exercise records first because they
             * belong to the selected workout.
             */
            try (PreparedStatement statement =
                         connection.prepareStatement(
                                 deleteExercises)) {

                statement.setInt(1, workoutId);
                statement.executeUpdate();
            }

            try (PreparedStatement statement =
                         connection.prepareStatement(
                                 deleteWorkout)) {

                statement.setInt(1, workoutId);

                int rowsDeleted =
                        statement.executeUpdate();

                return rowsDeleted > 0;
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error deleting workout: "
                            + e.getMessage());

            return false;
        }
    }
}