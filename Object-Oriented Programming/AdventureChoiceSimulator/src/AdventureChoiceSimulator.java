import java.util.Scanner;

public class AdventureChoiceSimulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for player name
        System.out.print("Enter your name: ");
        String playerName = input.nextLine();

        // Present the adventure choice
        System.out.println("\nYou arrive at a cave.");
        System.out.println("1 - Enter the cave");
        System.out.println("2 - Walk away");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();

        // Determine the outcome
        if (choice == 1) {
            System.out.println("\n" + playerName + " enters the cave and discovers hidden treasure!");
        } else {
            System.out.println("\n" + playerName + " walks away safely but misses the hidden treasure.");
        }

        // Final message
        System.out.println("\n===== ADVENTURE COMPLETE =====");
        System.out.println("Thank you for playing, " + playerName + "!");
        System.out.println("==============================");

        input.close();
    }
}
