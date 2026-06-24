// Author: Brian Taylor
// 06/24/2026
// This program calculates the recommended study hours for a student based on the number of assignments they have.

import java.util.Scanner;


public class StudySessionPlanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for student information
        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter number of assignments: ");
        int assignments = input.nextInt();

        // Call method to calculate study hours
        int studyHours = calculateStudyHours(assignments);

        // Determine study plan
        String studyPlan;

        if (assignments <= 2) {
            studyPlan = "Light study session recommended.";
        }
        else if (assignments <= 4) {
            studyPlan = "Focused study session recommended.";
        }
        else {
            studyPlan = "Intense study session recommended. Bring snacks.";
        }

        // Display summary
        System.out.println();
        System.out.println(studentName + " has " + assignments + " assignments.");
        System.out.println("Recommended study hours: " + studyHours);
        System.out.println(studyPlan);

        input.close();
    }

    // Method to calculate study hours
    public static int calculateStudyHours(int assignments) {
        return assignments * 2;
    }
}