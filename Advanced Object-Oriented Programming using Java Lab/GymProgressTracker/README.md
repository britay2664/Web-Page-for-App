# Gym Progress Tracker
# Youtube Demo

A video demonstration of the completed Gym Progress Tracker application is available on YouTube:
https://www.youtube.com/watch?v=kz77nGg3bWw


## Project Overview

The Gym Progress Tracker is a Java console application designed to allow
users to record, manage, and review their workout information. The
application supports both strength and cardio exercises and allows users
to add workouts, view workout history, track progress, calculate workout
volume, update workouts, and delete workouts.

The project was developed throughout the course by gradually applying
object-oriented programming concepts and adding new functionality to the
application. The final version combines Java object-oriented programming
with SQLite database storage so that workout information can be saved
and retrieved between application sessions.

## Design and Implementation

The application was designed using multiple classes with separate
responsibilities. Exercise serves as an abstract base class for the
different types of exercises in the application. StrengthExercise and
CardioExercise inherit from Exercise and provide functionality specific
to each exercise type.

WorkoutSession represents a workout and contains a collection of
Exercise objects. This demonstrates composition because a workout
session is made up of individual exercises.

The ProgressTrackable interface is used to define progress-tracking
behavior. The application also uses polymorphism by allowing different
types of Exercise objects to be handled through the common Exercise
parent type.

The GymProgressTrackerApp class provides the main console menu and
allows the user to interact with the program.

DatabaseManager manages the connection between the Java application and
the SQLite database. It performs the database operations required to
create, read, update, and delete workout information.

## What Went Well

One of the strongest parts of the project was building the application
in phases. Starting with the class structure and gradually adding
inheritance, abstraction, interfaces, polymorphism, file handling, and
database functionality made it easier to understand how the different
parts of the application worked together.

The object-oriented structure also worked well. Separating strength and
cardio exercises into subclasses made the application easier to organize
and allowed the program to handle different exercise types while still
using common functionality from the Exercise class.

The SQLite database was another successful part of the project. Workout
information can remain available after the application is closed and
restarted, making the final program more useful than an application that
only stores information temporarily in memory.

## Challenges and What Went Poorly

The database integration was the most challenging portion of the
project. Initially, the application had difficulty locating the SQLite
JDBC driver, which prevented the Java application from connecting to the
database. Correctly configuring the sqlite-jdbc library and Java
classpath resolved the issue.

Another challenge occurred when the database structure did not match the
Java code. For example, the application initially encountered an SQLite
error because the workouts table did not contain the workout_name column
expected by the program. Correcting the database structure and testing
the application again resolved the problem.

Git and GitHub also required troubleshooting during development. Making
sure the correct project files were tracked, committed, pushed, and
tagged required additional attention. These challenges helped reinforce
the importance of testing changes individually and verifying the
repository before submitting a software project.

## Project Requirements Mapping

### Object-Oriented Design

The project uses classes to separate application responsibilities and
organize the program into reusable components.

### Abstraction

Exercise is implemented as an abstract class that contains information
and behavior shared by different exercise types.

### Inheritance

StrengthExercise and CardioExercise extend Exercise and inherit common
properties and methods from the parent class.

### Polymorphism

StrengthExercise and CardioExercise objects can be handled using the
Exercise parent type. Each subclass provides behavior appropriate for
its specific exercise type.

### Interfaces

ProgressTrackable defines progress-tracking behavior that can be
implemented by the appropriate classes.

### Composition

WorkoutSession contains a collection of Exercise objects, demonstrating
a has-a relationship between a workout session and its exercises.

### Constructors and Access Specifiers

Constructors are used throughout the application to initialize objects.
Private fields are used to protect class data while public methods
provide controlled access to application functionality.

### Collections

ArrayList collections are used to organize workout and exercise
information while the application is running.

### File and Data Handling

The project demonstrates data handling as the application evolved and
ultimately uses persistent SQLite database storage for workout
information.

### Database Integration

SQLite and JDBC are used to provide persistent data storage. The
DatabaseManager class handles communication between Java and the
database.

### CRUD Operations

The final application supports the four primary database operations:

- Create - Add new workout information.
- Read - View previously stored workout information.
- Update - Modify an existing workout.
- Delete - Remove a workout from the database.

### User Interaction

GymProgressTrackerApp provides a console-based menu that allows users to
select application features and enter workout information.

## Final Reflection

Completing the Gym Progress Tracker helped bring together the individual
Java concepts covered throughout the course into one complete
application. Instead of using inheritance, abstraction, interfaces, or
databases as separate exercises, the final project demonstrates how
these concepts can work together within the same software application.

The project also provided experience troubleshooting Java libraries,
SQLite database structures, application logic, and GitHub version
control. If I continued developing the application, future improvements
could include a graphical user interface, user accounts, additional
progress reports, and visual charts for tracking fitness improvements
over time.