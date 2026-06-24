// Author: Brian Taylor
// Date: 2026-06-26
// Description: This program analyzes arcade game scores for a player, calculating total, average, and highest scores, and providing feedback based on performance.

import java.util.Scanner;

public class ArcadeScoreAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter player name: ");
        String playerName = input.nextLine();

        System.out.print("Enter the game name: ");
        String gameName = input.nextLine();

        System.out.print("How many scores will you enter? ");
        int numberOfScores = input.nextInt();

        int totalScore = 0;
        int highestScore = 0;

        for (int i = 1; i <= numberOfScores; i++) {
            System.out.print("Enter score #" + i + ": ");
            int score = input.nextInt();

            totalScore += score;

            if (score > highestScore) {
                highestScore = score;
            }
        }

        double averageScore = calculateAverage(totalScore, numberOfScores);

        String playerLevel = getPlayerLevel(averageScore);

        String performanceMessage;

        if (highestScore == 100) {
            performanceMessage = "Perfect round detected!";
        } else if (averageScore >= 85) {
            performanceMessage = "Strong performance this session.";
        } else if (averageScore < 60) {
            performanceMessage = "More practice recommended.";
        } else {
            performanceMessage = "Solid session. Keep improving!";
        }

        String bonusTitle;

        if (highestScore >= 95) {
            bonusTitle = "Arcade Legend";
        } else if (highestScore >= 80) {
            bonusTitle = "High Score Hunter";
        } else {
            bonusTitle = "Rising Player";
        }

        System.out.println();
        System.out.println("===== ARCADE SCORE SUMMARY =====");
        System.out.println("Player: " + playerName);
        System.out.println("Game: " + gameName);
        System.out.println("Scores Entered: " + numberOfScores);
        System.out.println("Total Score: " + totalScore);
        System.out.printf("Average Score: %.2f%n", averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Player Level: " + playerLevel);
        System.out.println("Bonus Title: " + bonusTitle);
        System.out.println(performanceMessage);
        System.out.println("================================");

        input.close();
    }

    public static double calculateAverage(int totalScore, int numberOfScores) {
        return (double) totalScore / numberOfScores;
    }

    public static String getPlayerLevel(double averageScore) {
        if (averageScore >= 90) {
            return "Expert";
        } else if (averageScore >= 75) {
            return "Advanced";
        } else if (averageScore >= 60) {
            return "Intermediate";
        } else {
            return "Beginner";
        }
    }
}