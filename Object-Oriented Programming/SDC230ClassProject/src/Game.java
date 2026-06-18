import java.util.Scanner;

public class Game {
    private Scanner input;
    private boolean running;
    private Player player;

    public Game() {
        input = new Scanner(System.in);
        running = true;
        player = new Player("Hero");
    }

    public void start() {
        System.out.println("Welcome to the Adventure Game!");

        while (running) {
            showMenu();
            String choice = input.nextLine();

            handleMenuChoice(choice);
        }

        System.out.println("Thanks for playing!");
        input.close();
    }

    private void showMenu() {
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. Start Game");
        System.out.println("2. View Player Info");
        System.out.println("3. Help");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private void handleMenuChoice(String choice) {
        switch (choice) {
            case "1":
                startGame();
                break;
            case "2":
                player.displayInfo();
                break;
            case "3":
                showHelp();
                break;
            case "4":
                running = false;
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void startGame() {
        System.out.println("Game starting...");
        System.out.println("Gameplay features will be added in future weeks.");
    }

    private void showHelp() {
        System.out.println("Use the menu numbers to choose what you want to do.");
        System.out.println("More instructions will be added as the game is developed.");
    }
}