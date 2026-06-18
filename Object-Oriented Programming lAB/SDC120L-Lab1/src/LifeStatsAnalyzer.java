//Author: Brian Taylor
//Date: 2026-06-16
// This program collects user input about their name, age, sleep habits, coffee consumption, and study hours. It then calculates and displays various life statistics based on the input data.


import java.util.Scanner;

public class LifeStatsAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter age in years: ");
        int age = input.nextInt();

        System.out.print("Enter hours of sleep per night: ");
        double sleepHours = input.nextDouble();

        System.out.print("Enter cups of coffee per day: ");
        double coffeePerDay = input.nextDouble();

        System.out.print("Enter study hours per week: ");
        double studyHoursPerWeek = input.nextDouble();

        int hoursAlive = age * 365 * 24;
        double sleepPerYear = sleepHours * 365;
        double coffeePerWeek = coffeePerDay * 7;
        double studyPerSemester = studyHoursPerWeek * 15;

        System.out.println();
        System.out.println("===== LIFE STATS REPORT =====");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age + " years");
        System.out.println();

        System.out.println("Hours alive: " + hoursAlive);
        System.out.printf("Sleep per year: %.1f hours%n", sleepPerYear);
        System.out.printf("Coffee per week: %.1f cups%n", coffeePerWeek);
        System.out.printf("Study hours per semester: %.1f hours%n", studyPerSemester);

        System.out.println();
        System.out.println("Conclusion: Your semester may be powered by caffeine and deadlines.");
        System.out.println("=============================");

        input.close();
    }
}