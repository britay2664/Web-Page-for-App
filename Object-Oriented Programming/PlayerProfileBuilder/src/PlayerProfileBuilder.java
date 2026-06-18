// Author: Brian Taylor
// Date: 06/15/2026
// Description: This program collects player information and builds a player profile for a game.


import java.util.Scanner;

public class PlayerProfileBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Collect player information
        System.out.print("Enter player name: ");
        String playerName = input.nextLine();

        System.out.print("Enter player age: ");
        int age = input.nextInt();

        input.nextLine(); // Clears the leftover newline

        System.out.print("Enter favorite weapon: ");
        String weapon = input.nextLine();

        System.out.print("Enter starting health: ");
        int health = input.nextInt();

        System.out.print("Enter starting energy: ");
        int energy = input.nextInt();

        // Calculate total power
        int totalPower = health + energy;

        // Display player profile
        System.out.println("\n===== PLAYER PROFILE =====");
        System.out.println("Name: " + playerName);
        System.out.println("Age: " + age);
        System.out.println("Weapon: " + weapon);
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Total Power: " + totalPower);
        System.out.println("==========================");

        // Close Scanner
        input.close();
    }
}




