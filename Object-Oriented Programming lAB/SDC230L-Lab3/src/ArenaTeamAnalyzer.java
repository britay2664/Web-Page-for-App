// Author: Brian Taylor
// Date: 07/07/2026
// Description: This program analyzes the performance of an arena team based on the scores of its fighters. It calculates the total score, average score, and highest score, and provides a rating for the team based on the average score.


import java.util.Scanner;

public class ArenaTeamAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many fighters are on the team? ");
        int teamSize = input.nextInt();

        int[] scores = new int[teamSize];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for fighter #" + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        int total = calculateTotal(scores);
        double average = calculateAverage(total, scores.length);
        int highest = findHighest(scores);

        System.out.println();
        System.out.println("Arena Team Results");
        System.out.println("------------------");
        System.out.println("Total Team Score: " + total);
        System.out.println("Average Team Score: " + average);
        System.out.println("Highest Fighter Score: " + highest);

        showTeamRating(average);

        input.close();
    }

    public static int calculateTotal(int[] values) {
        int total = 0;

        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }

        return total;
    }

    public static double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    public static int findHighest(int[] values) {
        int highest = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > highest) {
                highest = values[i];
            }
        }

        return highest;
    }

    public static void showTeamRating(double average) {
        if (average >= 90) {
            System.out.println("Team Rating: Legendary Squad");
        } else if (average >= 75) {
            System.out.println("Team Rating: Arena Ready");
        } else if (average >= 60) {
            System.out.println("Team Rating: Still Training");
        } else {
            System.out.println("Team Rating: Needs More Practice");
        }
    }
}