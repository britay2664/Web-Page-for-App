import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    private Scanner input;
    private boolean running;
    private Player player;
    private ArrayList<Item> items;

    public Game() {
        input = new Scanner(System.in);
        running = true;
        player = new Player("Hero");
        items = new ArrayList<Item>();
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
        System.out.println("4. Add Item");
        System.out.println("5. View Items");
        System.out.println("6. Exit");
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
                addItem();
                break;

            case "5":
                 viewItems();
                break;

            case "6":
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

    private void addItem() {
    System.out.print("Enter item name: ");
    String name = input.nextLine();

    System.out.print("Enter item description: ");
    String description = input.nextLine();

    Item newItem = new Item(name, description);
    items.add(newItem);

    System.out.println("Item added successfully!");
}

private void viewItems() {
    if (items.isEmpty()) {
        System.out.println("No items have been added yet.");
    } else {
        System.out.println("\n===== STORED ITEMS =====");

        for (Item item : items) {
            item.displayItem();
            System.out.println("--------------------");
        }
    }
}

}