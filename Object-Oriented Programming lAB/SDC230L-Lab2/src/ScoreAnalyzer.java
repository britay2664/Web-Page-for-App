// Author: Brian Taylor
// Date: 2026-06-23
// This program analyzes a student's test score, determines the corresponding letter grade, and provides feedback based on the score.

import java.util.Scanner;

public class ScoreAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter test score: ");
        int score = input.nextInt();

        String letterGrade = getLetterGrade(score);

        String message;

        if (score >= 90) {
            message = "Excellent work!";
        } else if (score >= 80) {
            message = "Great job!";
        } else if (score >= 70) {
            message = "Good effort.";
        } else if (score >= 60) {
            message = "You passed, but keep practicing.";
        } else {
            message = "More review is needed.";
        }

        System.out.println();
        System.out.println("===== SCORE SUMMARY =====");
        System.out.println("Student: " + studentName);
        System.out.println("Score: " + score);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println(message);
        System.out.println("=========================");

        input.close();
    }

    public static String getLetterGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}