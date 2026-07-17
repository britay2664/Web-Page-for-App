// Author: Brian Taylor
// Date: 07/07/2026
// Description: This program evaluates the performance of a guild based on the scores of its members. It calculates the total score, average score, and highest score, and provides a guild rating based on the average score.

import java.util.Scanner;

public class GuildPerformanceAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many guild members are being evaluated? ");
        int memberCount = input.nextInt();

        int[] scores = new int[memberCount];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for guild member #" + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        int total = calculateTotal(scores);
        double average = calculateAverage(total, scores.length);
        int highest = findHighest(scores);

        System.out.println();
        System.out.println("Guild Performance Report");
        System.out.println("------------------------");
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);

        displayGuildRating(average);

        input.close();
    }

    public static int calculateTotal(int[] scores) {

        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        return total;
    }

    public static double calculateAverage(int total, int count) {

        return (double) total / count;

    }

    public static int findHighest(int[] scores) {

        int highest = scores[0];

        for (int i = 1; i < scores.length; i++) {

            if (scores[i] > highest) {
                highest = scores[i];
            }

        }

        return highest;

    }

    public static void displayGuildRating(double average) {

        if (average >= 90) {
            System.out.println("Guild Rating: Legendary Guild");
        }
        else if (average >= 75) {
            System.out.println("Guild Rating: Elite Guild");
        }
        else if (average >= 60) {
            System.out.println("Guild Rating: Skilled Adventurers");
        }
        else {
            System.out.println("Guild Rating: Training Required");
        }

    }
}