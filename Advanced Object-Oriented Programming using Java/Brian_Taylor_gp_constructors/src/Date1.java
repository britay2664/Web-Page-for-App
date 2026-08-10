/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Week 3 GP – Constructors
 *
 * This class demonstrates constructor overloading by providing 3
 * parameterized constructors and one no-arg constructor. Note that
 * the parameterized constructor that takes 3 parameters is really
 * the only constructor that "does" anything. The other constructors
 * simply call the main constructor, ensuring that valid values are
 * passed along with whatever their parameter(s).
 *
 * The DateString is used to either display the date information from
 * the class or to provide an error message. Getters are provided in
 * the event the class user wants to access only specific parts of
 * the Date1 object.
 *******************************************************************/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Date1 {

    private int Day;
    private String DayName;
    private int Month;
    private String DateString;

    private static final List<String> ValidDays =
        Collections.unmodifiableList(Arrays.asList(
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        ));

    public Date1(int day, String dayName, int month) {

        // Do some basic validation
        if (day < 1 || day > 31) {

            DateString =
                "Invalid Day specified - must be in range 1 - 31\n";

        } else if (!ValidDays.contains(dayName)) {

            DateString =
                "Invalid Day Name specified\n";

        } else if (month < 1 || month > 12) {

            DateString =
                "Invalid Month specified - must be in range 1 - 12\n";

        } else {

            Day = day;
            DayName = dayName;
            Month = month;

            generateDateString();
        }
    }

    public Date1() {

        // Call full constructor with valid default information
        this(1, "Sunday", 1);
    }

    public Date1(int day, String dayName) {

        // Use provided day and day name, default month to 1
        this(day, dayName, 1);
    }

    public Date1(int month) {

        // Use provided month, default the other values
        this(1, "Sunday", month);
    }

    private void generateDateString() {

        DateString = String.format(
            "Date String Created:%n%s%d%n%s%s%n%s%d%n",
            " Day: ", Day,
            " Day Name: ", DayName,
            " Month: ", Month
        );
    }

    public int getDay() {
        return Day;
    }

    public String getDayName() {
        return DayName;
    }

    public int getMonth() {
        return Month;
    }

    @Override
    public String toString() {
        return DateString;
    }
}