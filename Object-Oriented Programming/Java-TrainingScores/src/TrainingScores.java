// Author: Brian Taylor
// Date: 07/06/2026
// Description: This program prompts the user to enter a number of training scores, calculates the total, average, and highest score, and then displays the results.

import java.util.Scanner;

public class TrainingScores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many training scores will you enter? ");
        int numberOfScores = input.nextInt();

        int[] scores = new int[numberOfScores];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        double average = (double) total / scores.length;

        int highest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        System.out.println("\nTraining Results");
        System.out.println("----------------");
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);

        input.close();
    }
}
