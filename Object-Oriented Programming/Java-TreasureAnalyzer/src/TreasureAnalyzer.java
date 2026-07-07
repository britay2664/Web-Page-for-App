// Author: Brian Taylor
// Date: 07/06/206
// Purpose: This program calculates the total, average, and highest value of treasure found in a dungeon.

import java.util.Scanner;

public class TreasureAnalyzer {

    public static int calculateTotal(int[] treasure) {

        int total = 0;

        for (int i = 0; i < treasure.length; i++) {
            total += treasure[i];
        }

        return total;
    }

    public static double calculateAverage(int total, int numberOfChests) {
        return (double) total / numberOfChests;
    }

    public static int findHighest(int[] treasure) {

        int highest = treasure[0];

        for (int i = 1; i < treasure.length; i++) {

            if (treasure[i] > highest) {
                highest = treasure[i];
            }

        }

        return highest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many treasure chests were opened? ");
        int numberOfChests = input.nextInt();

        int[] treasure = new int[numberOfChests];

        for (int i = 0; i < treasure.length; i++) {
            System.out.print("Enter gold value for chest " + (i + 1) + ": ");
            treasure[i] = input.nextInt();
        }

        int total = calculateTotal(treasure);
        double average = calculateAverage(total, numberOfChests);
        int highest = findHighest(treasure);

        System.out.println();
        System.out.println("Dungeon Treasure Results");
        System.out.println("------------------------");
        System.out.println("Total Treasure: " + total);
        System.out.println("Average Treasure: " + average);
        System.out.println("Most Valuable Chest: " + highest);

        input.close();
    }
}