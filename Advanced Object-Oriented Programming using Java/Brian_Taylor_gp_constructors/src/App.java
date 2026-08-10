/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Week 3 GP – Constructors
 *
 * Main application class.
 *******************************************************************/

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println(
            "\nBrian Taylor, Week 3 Constructors GP\n"
        );

        // Create Date1 objects using valid data,
        // invalid data, and different constructors.

        Date1 date1 =
            new Date1(11, "Monday", 9);

        System.out.println(
            "Date 1 created with valid information:\n"
            + date1
        );

        date1 =
            new Date1(42, "Monday", 9);

        System.out.println(
            "Date 1 created with invalid day:\n"
            + date1
        );

        date1 =
            new Date1(12, "Friesday", 9);

        System.out.println(
            "Date 1 created with invalid day name:\n"
            + date1
        );

        date1 =
            new Date1(12, "Monday", 13);

        System.out.println(
            "Date 1 created with invalid month:\n"
            + date1
        );

        date1 =
            new Date1();

        System.out.println(
            "Date 1 created with no-arg constructor:\n"
            + date1
        );

        date1 =
            new Date1(13, "Friday");

        System.out.println(
            "Date 1 created with 2-param constructor:\n"
            + date1
        );

        date1 =
            new Date1(6);

        System.out.println(
            "Date 1 created with 1-param constructor:\n"
            + date1
        );

        // Create Date2 using the default constructor.

        Date2 date2 =
            new Date2();

        System.out.println(
            "Date 2 created with default constructor:\n"
            + date2
        );

        date2.setDate2("07/04/1776");

        System.out.println(
            "Date 2 updated with a valid date:\n"
            + date2
        );

        date2.setDate2("Independence Day");

        System.out.println(
            "Date 2 updated with an invalid date:\n"
            + date2
        );
    }
}
