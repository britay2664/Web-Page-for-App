package gymtracker;

/*******************************************************************
 * Name: Brian Taylor
 * Date: August 8, 2026
 * Assignment: SDC330 Project Week 2
 *
 * Purpose:
 * This interface defines progress tracking behavior for exercise
 * classes in the Gym Progress Tracker application.
 *******************************************************************/

public interface ProgressTrackable {

    // Classes that implement this interface must provide
    // their own version of this method.
    String getProgressSummary();
}