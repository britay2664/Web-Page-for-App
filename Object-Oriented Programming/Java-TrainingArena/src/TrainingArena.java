// Author:  Brian Taylor
// Date: 07/06/2026
// Description: This program calculates the total and average scores of two training sessions and provides feedback based on the average score.

import java.util.Scanner;

public class TrainingArena {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score for training session 1: ");
        int score1 = input.nextInt();

        System.out.print("Enter score for training session 2: ");
        int score2 = input.nextInt();

        int total = calculateTotal(score1, score2);
        double average = calculateAverage(total);

        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);

        showLevel(average);

        input.close();
    }

    public static int calculateTotal(int a, int b) {
        return a + b;
    }

    public static double calculateAverage(int total) {
        return (double) total / 2;
    }

    public static void showLevel(double average) {
        if (average >= 90) {
            System.out.println("Elite training level!");
        } else if (average >= 70) {
            System.out.println("Solid training performance.");
        } else {
            System.out.println("More training required.");
        }
    }
}