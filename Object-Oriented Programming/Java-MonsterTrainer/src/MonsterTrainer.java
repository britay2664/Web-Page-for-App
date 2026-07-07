// Author: Brian Taylor
// Date 07/06/2026
// Description: This program calculates the total and average of two training scores for a monster and determines its power level based on the average score.

import java.util.Scanner;

public class MonsterTrainer {

    public int calculateTotal(int score1, int score2) {
        return score1 + score2;
    }

    public double calculateAverage(int total) {
        return (double) total / 2;
    }

    public void showPowerLevel(double average) {

        if (average >= 90) {
            System.out.println("Legendary Monster");
        }
        else if (average >= 75) {
            System.out.println("Battle Ready");
        }
        else if (average >= 60) {
            System.out.println("Still Training");
        }
        else {
            System.out.println("Needs More Snacks and Practice");
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter monster name: ");
        String monsterName = input.nextLine();

        System.out.print("Enter first training score: ");
        int score1 = input.nextInt();

        System.out.print("Enter second training score: ");
        int score2 = input.nextInt();

        MonsterTrainer trainer = new MonsterTrainer();

        int total = trainer.calculateTotal(score1, score2);

        double average = trainer.calculateAverage(total);

        System.out.println();
        System.out.println("Monster: " + monsterName);
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);

        trainer.showPowerLevel(average);

        input.close();
    }
}