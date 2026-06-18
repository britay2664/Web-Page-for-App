// Author: Brian Taylor
// Date: 2026-06-16
// This program builds a campus survival kit based on user input about their name, number of classes, budget, coffee preference, and snack preference. 
// It calculates the total cost of the kit and checks if it fits within the user's budget.

import java.util.Scanner;

public class CampusSurvivalKitBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String studentName = input.nextLine();

        System.out.print("How many classes do you have today? ");
        int classesToday = input.nextInt();

        System.out.print("Enter your campus budget: ");
        double budget = input.nextDouble();

        System.out.print("Do you like coffee? (true/false): ");
        boolean likesCoffee = input.nextBoolean();

        System.out.print("Do you want a snack? (true/false): ");
        boolean wantsSnack = input.nextBoolean();

        double notebookCost = 4.00;
        double penCost = 2.50;
        double waterCost = 3.00;

        double baseKitCost = notebookCost + penCost + waterCost;

        String drinkName;
        double drinkCost;

        if (likesCoffee) {
            drinkName = "Coffee";
            drinkCost = 4.50;
        } else {
            drinkName = "Tea";
            drinkCost = 3.50;
        }

        double snackCost;

        if (wantsSnack) {
            snackCost = 2.75;
        } else {
            snackCost = 0.00;
        }

        String bonusItem = "None";
        double bonusCost = 0.00;

        if (classesToday >= 5) {
            bonusItem = "Extra Water";
            bonusCost = 1.50;
        } else {
            bonusItem = "Encouragement Note";
            bonusCost = 0.00;
        }

        double totalCost = baseKitCost + drinkCost + snackCost + bonusCost;
        double remainingBudget = budget - totalCost;

        System.out.println();
        System.out.println("===== CAMPUS SURVIVAL KIT =====");
        System.out.println("Student: " + studentName);
        System.out.println("Classes Today: " + classesToday);
        System.out.printf("Base Kit Cost: $%.2f%n", baseKitCost);
        System.out.println("Drink: " + drinkName);
        System.out.println("Snack Added: " + wantsSnack);
        System.out.println("Personal Feature: " + bonusItem);
        System.out.printf("Total Kit Cost: $%.2f%n", totalCost);
        System.out.printf("Remaining Budget: $%.2f%n", remainingBudget);

        if (remainingBudget < 0) {
            System.out.println("Warning: your survival kit is over budget.");
        } else {
            System.out.println("Success: your survival kit fits your budget.");
        }

        System.out.println("===============================");

        input.close();
    }
}