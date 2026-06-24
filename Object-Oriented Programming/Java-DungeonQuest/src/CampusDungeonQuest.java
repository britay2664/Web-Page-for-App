// Brian Taylor
// 06/24/2026
// This program simulates a student entering a dungeon on campus. The student must have enough energy, a flashlight, and completed homework to enter the dungeon.


import java.util.Scanner;

public class CampusDungeonQuest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Campus Dungeon!");
        System.out.println("Only prepared students should enter...");
        System.out.println();

        System.out.print("Enter your energy level (1-10): ");
        int energy = input.nextInt();

        System.out.print("Do you have a flashlight? (true/false): ");
        boolean flashlight = input.nextBoolean();

        System.out.print("Did you finish your homework? (true/false): ");
        boolean homeworkDone = input.nextBoolean();

        if (energy >= 9 && flashlight && homeworkDone) {
            System.out.println("You charge into the dungeon like a legend!");
        }
        else if (energy >= 5 && flashlight && homeworkDone) {
            System.out.println("You cautiously enter the dungeon.");
        }
        else if (!flashlight) {
            System.out.println("It is too dark. You should find a flashlight first.");
        }
        else if (!homeworkDone) {
            System.out.println("Your conscience stops you. Finish your homework first.");
        }
        else if (energy < 5) {
            System.out.println("You are too tired. The dungeon will still be here tomorrow.");
        }
        else {
            System.out.println("You wander back to the cafeteria instead.");
        }

        input.close();
    }
}