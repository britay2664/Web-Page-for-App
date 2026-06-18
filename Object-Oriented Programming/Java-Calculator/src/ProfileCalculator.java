
import java.util.Scanner;

// Author: Brian Taylor 
// Date: June 15 2026
// Description: This program collects user information such as name, birth year, current year, and height in inches. It then calculates the user's age and converts their height to centimeters before displaying a profile summary.
// Version: 1.0

public class ProfileCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth year (example 2004): ");
        int birthYear = input.nextInt();

        System.out.print("Enter current year (example 2026): ");
        int currentYear = input.nextInt();

        System.out.print("Enter height in inches (example 68.5): ");
        double heightInches = input.nextDouble();

        int age = currentYear - birthYear;

        double heightCm = heightInches * 2.54;

        System.out.println("\n===== PROFILE SUMMARY =====");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.printf("Height (inches): %.1f%n", heightInches);
        System.out.printf("Height (cm): %.2f%n", heightCm);
        System.out.println("===========================\n");

        input.close();
    }
}

