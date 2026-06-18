// Author: Brian Taylor
// Date: 2026-06-17
// Description: A simple Java program that recommends a movie type based on user input.

import java.util.Scanner;

public class MovieNightChooser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Do you want an exciting movie? (true or false): ");
        boolean wantsExciting = input.nextBoolean();

        String recommendation;

        if (wantsExciting && age >= 13) {
            recommendation = "Action Movie";
        } else if (wantsExciting && age < 13) {
            recommendation = "Animated Adventure";
        } else if (!wantsExciting && age >= 13) {
            recommendation = "Comedy";
        } else {
            recommendation = "Family Movie";
        }

        System.out.println("\n===== MOVIE NIGHT SUMMARY =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Wants Exciting Movie: " + wantsExciting);
        System.out.println("Recommended Movie Type: " + recommendation);
        System.out.println("================================");

        input.close();
    }
}
