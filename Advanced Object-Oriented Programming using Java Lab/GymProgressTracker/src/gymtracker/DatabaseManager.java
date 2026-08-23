package gymtracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



/*
 * Name: Brian Taylor
 * Date: August 23, 2026
 * Course: SDC330
 * Assignment: Course Project - Phase 2
 *
 * Description:
 * Handles the SQLite database connection and creates
 * the tables used by the Gym Progress Tracker.
 */

public class DatabaseManager {

    private static final String DB_URL =
            "jdbc:sqlite:gym_progress_tracker.db";

    // Connect to the SQLite database
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

    // Create the database tables
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
                    muscle_group TEXT,
                    sets INTEGER,
                    reps INTEGER,
                    weight REAL,
                    duration INTEGER,
                    distance REAL,
                    FOREIGN KEY (workout_id)
                    REFERENCES workouts(id)
                );
                """;

        try (Connection connection = connect();
             Statement statement = connection.createStatement()) {

            statement.execute(workoutTable);
            statement.execute(exerciseTable);

            System.out.println("Database initialized successfully.");

        } catch (SQLException e) {

            System.out.println(
                    "Database initialization error: "
                    + e.getMessage()
            );
        }
    }


public static int saveWorkout(String workoutDate, String workoutName) {

    String sql = """
            INSERT INTO workouts (workout_date, workout_name)
            VALUES (?, ?);
            """;

    try (Connection connection = connect();
         PreparedStatement statement =
                 connection.prepareStatement(
                         sql,
                         Statement.RETURN_GENERATED_KEYS)) {

        statement.setString(1, workoutDate);
        statement.setString(2, workoutName);

        statement.executeUpdate();

        ResultSet keys = statement.getGeneratedKeys();

        if (keys.next()) {
            return keys.getInt(1);
        }

    } catch (SQLException e) {
        System.out.println(
                "Error saving workout: " + e.getMessage());
    }

    return -1;
}


public static void saveStrengthExercise(
        int workoutId,
        String exerciseName,
        String muscleGroup,
        int sets,
        int reps,
        double weight) {

    String sql = """
            INSERT INTO exercises
            (workout_id, exercise_type, exercise_name,
             muscle_group, sets, reps, weight)
            VALUES (?, ?, ?, ?, ?, ?, ?);
            """;

    try (Connection connection = connect();
         PreparedStatement statement =
                 connection.prepareStatement(sql)) {

        statement.setInt(1, workoutId);
        statement.setString(2, "Strength");
        statement.setString(3, exerciseName);
        statement.setString(4, muscleGroup);
        statement.setInt(5, sets);
        statement.setInt(6, reps);
        statement.setDouble(7, weight);

        statement.executeUpdate();

        System.out.println("Exercise saved to database.");

    } catch (SQLException e) {
        System.out.println(
                "Error saving exercise: " + e.getMessage());
    }
}

public static void saveCardioExercise(
        int workoutId,
        String exerciseName,
        String muscleGroup,
        int duration,
        double distance) {

    String sql = """
            INSERT INTO exercises
            (workout_id, exercise_type, exercise_name,
             muscle_group, duration, distance)
            VALUES (?, ?, ?, ?, ?, ?);
            """;

    try (Connection connection = connect();
         PreparedStatement statement =
                 connection.prepareStatement(sql)) {

        statement.setInt(1, workoutId);
        statement.setString(2, "Cardio");
        statement.setString(3, exerciseName);
        statement.setString(4, muscleGroup);
        statement.setInt(5, duration);
        statement.setDouble(6, distance);

        statement.executeUpdate();

        System.out.println("Exercise saved to database.");

    } catch (SQLException e) {
        System.out.println(
                "Error saving exercise: " + e.getMessage());
    }
}

public static ArrayList<WorkoutSession> loadWorkouts() {

    ArrayList<WorkoutSession> workouts = new ArrayList<>();

    String workoutSql =
            "SELECT id, workout_date, workout_name FROM workouts ORDER BY id;";

    String exerciseSql =
            "SELECT exercise_type, exercise_name, muscle_group, sets, reps, weight, duration, distance "
            + "FROM exercises WHERE workout_id = ? ORDER BY id;";

    try (Connection connection = connect();
         PreparedStatement workoutStatement =
                 connection.prepareStatement(workoutSql);
         ResultSet workoutResults =
                 workoutStatement.executeQuery()) {

        while (workoutResults.next()) {

            int workoutId =
                    workoutResults.getInt("id");

            String workoutDate =
                    workoutResults.getString("workout_date");

            String workoutName =
                    workoutResults.getString("workout_name");

            WorkoutSession workout =
                    new WorkoutSession(
                            workoutDate,
                            workoutName);

            try (PreparedStatement exerciseStatement =
                         connection.prepareStatement(exerciseSql)) {

                exerciseStatement.setInt(1, workoutId);

                try (ResultSet exerciseResults =
                             exerciseStatement.executeQuery()) {

                    while (exerciseResults.next()) {

                        String exerciseType =
                                exerciseResults.getString(
                                        "exercise_type");

                        String exerciseName =
                                exerciseResults.getString(
                                        "exercise_name");

                        String muscleGroup =
                                exerciseResults.getString(
                                        "muscle_group");

                        if ("Strength".equalsIgnoreCase(exerciseType)) {

                            int sets =
                                    exerciseResults.getInt("sets");

                            int reps =
                                    exerciseResults.getInt("reps");

                            double weight =
                                    exerciseResults.getDouble("weight");

                            StrengthExercise exercise =
                                    new StrengthExercise(
                                            exerciseName,
                                            muscleGroup,
                                            sets,
                                            reps,
                                            weight);

                            workout.addExercise(exercise);

                        } else if ("Cardio".equalsIgnoreCase(exerciseType)) {

                            int duration =
                                    exerciseResults.getInt("duration");

                            double distance =
                                    exerciseResults.getDouble("distance");

                            CardioExercise exercise =
                                    new CardioExercise(
                                            exerciseName,
                                            muscleGroup,
                                            duration,
                                            distance);

                            workout.addExercise(exercise);
                        }
                    }
                }
            }

            workouts.add(workout);
        }

    } catch (SQLException e) {

        System.out.println(
                "Error loading workouts: "
                + e.getMessage());
    }

    return workouts;
}

}