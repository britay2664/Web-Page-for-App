import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner input;
    private Random random;
    private boolean running;

    private Player player;
    private ArrayList<Item> items;
    private ArrayList<Character> characters;
    private ArrayList<Mission> missions;

    public Game() {
        input = new Scanner(System.in);
        random = new Random();
        running = true;

        player = new Player("Hero");

        items = new ArrayList<Item>();
        characters = new ArrayList<Character>();
        missions = new ArrayList<Mission>();

        characters.add(new Warrior("Blade", 120));
        characters.add(new Hacker("Cipher", 90));

        missions.add(new Mission(
                "Forest Rescue",
                "Rescue a traveler trapped in the dangerous forest.",
                1,
                25,
                10,
                "Health Potion"));

        missions.add(new Mission(
                "Security Breach",
                "Stop an enemy from accessing the city computer system.",
                2,
                40,
                20,
                "Data Chip"));

        missions.add(new Mission(
                "Dragon Fortress",
                "Enter the fortress and defeat the dragon commander.",
                3,
                60,
                30,
                "Dragon Sword"));
    }

    public void start() {
        System.out.println("Welcome to the Adventure Game!");

        while (running) {
            showMenu();
            String choice = input.nextLine().trim();

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
        System.out.println("6. View Characters");
        System.out.println("7. Use Character Abilities");
        System.out.println("8. View Missions");
        System.out.println("9. Send Character on Mission");
        System.out.println("10. Exit");
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
                viewCharacters();
                break;

            case "7":
                useCharacterAbilities();
                break;

            case "8":
                viewMissions();
                break;

            case "9":
                sendCharacterOnMission();
                break;

            case "10":
                running = false;
                break;

            default:
                System.out.println("Invalid option. Enter a number from 1 through 10.");
        }
    }

    private void startGame() {
        System.out.println("\nThe adventure has started!");
        System.out.println("Choose option 9 to send a character on a mission.");
    }

    private void showHelp() {
        System.out.println("\n===== HELP =====");
        System.out.println("Use the menu numbers to select an action.");
        System.out.println("Complete missions to gain XP and collect items.");
        System.out.println("Failed missions can cause characters to lose health.");
    }

    private void addItem() {
        System.out.print("Enter item name: ");
        String name = input.nextLine().trim();

        while (name.isEmpty()) {
            System.out.println("Item name cannot be empty.");
            System.out.print("Enter item name: ");
            name = input.nextLine().trim();
        }

        System.out.print("Enter item description: ");
        String description = input.nextLine().trim();

        while (description.isEmpty()) {
            System.out.println("Item description cannot be empty.");
            System.out.print("Enter item description: ");
            description = input.nextLine().trim();
        }

        Item newItem = new Item(name, description);
        items.add(newItem);

        System.out.println("Item added successfully!");
    }

    private void viewItems() {
        if (items.isEmpty()) {
            System.out.println("No items have been collected yet.");
            return;
        }

        System.out.println("\n===== INVENTORY =====");

        for (int i = 0; i < items.size(); i++) {
            System.out.println("Item #" + (i + 1));
            items.get(i).displayItem();
            System.out.println("--------------------");
        }
    }

    private void viewCharacters() {
        System.out.println("\n===== CHARACTERS =====");

        for (int i = 0; i < characters.size(); i++) {
            System.out.println("Character #" + (i + 1));
            characters.get(i).displayInfo();
            System.out.println("--------------------");
        }
    }

    private void useCharacterAbilities() {
        System.out.println("\n===== SPECIAL ABILITIES =====");

        for (Character character : characters) {
            character.useSpecialAbility();
        }
    }

    private void viewMissions() {
        System.out.println("\n===== AVAILABLE MISSIONS =====");

        for (int i = 0; i < missions.size(); i++) {
            System.out.println("Mission #" + (i + 1));
            missions.get(i).displayMission();
            System.out.println("--------------------");
        }
    }

    private void sendCharacterOnMission() {
        System.out.println("\n===== SELECT A CHARACTER =====");

        for (int i = 0; i < characters.size(); i++) {
            Character character = characters.get(i);

            System.out.println(
                    (i + 1) + ". "
                    + character.getName()
                    + " | Health: "
                    + character.getHealth()
                    + " | XP: "
                    + character.getXp());
        }

        int characterChoice = readNumber(
                "Choose a character: ",
                1,
                characters.size());

        Character selectedCharacter =
                characters.get(characterChoice - 1);

        if (selectedCharacter.getHealth() <= 0) {
            System.out.println(
                    selectedCharacter.getName()
                    + " has no health remaining and cannot go on a mission.");

            return;
        }

        System.out.println("\n===== SELECT A MISSION =====");

        for (int i = 0; i < missions.size(); i++) {
            Mission mission = missions.get(i);

            System.out.println(
                    (i + 1) + ". "
                    + mission.getName()
                    + " | Difficulty: "
                    + mission.getDifficulty());
        }

        int missionChoice = readNumber(
                "Choose a mission: ",
                1,
                missions.size());

        Mission selectedMission = missions.get(missionChoice - 1);

        performMission(selectedCharacter, selectedMission);
    }

    private void performMission(
            Character character,
            Mission mission) {

        System.out.println("\n===== MISSION STARTED =====");
        System.out.println(character.getName()
                + " begins: "
                + mission.getName());

        character.useSpecialAbility();

        int successChance = 80 - (mission.getDifficulty() * 15);
        int result = random.nextInt(100) + 1;

        System.out.println("Success chance: " + successChance + "%");
        System.out.println("Mission roll: " + result);

        if (result <= successChance) {
            character.addXp(mission.getXpReward());

            Item reward = new Item(
                    mission.getItemReward(),
                    "Reward earned from completing "
                            + mission.getName());

            items.add(reward);

            System.out.println("\nMISSION SUCCESS!");
            System.out.println(
                    character.getName()
                    + " gained "
                    + mission.getXpReward()
                    + " XP.");

            System.out.println(
                    mission.getItemReward()
                    + " was added to the inventory.");
        } else {
            character.takeDamage(mission.getHealthPenalty());

            System.out.println("\nMISSION FAILED!");
            System.out.println(
                    character.getName()
                    + " lost "
                    + mission.getHealthPenalty()
                    + " health.");
        }

        displayMissionResults(character);
    }

    private void displayMissionResults(Character character) {
        System.out.println("\n===== UPDATED CHARACTER STATE =====");
        character.displayInfo();
        System.out.println("Inventory items: " + items.size());

        if (character.getHealth() == 0) {
            System.out.println(
                    character.getName()
                    + " is unable to continue fighting.");
        }
    }

    private int readNumber(
            String prompt,
            int minimum,
            int maximum) {

        while (true) {
            System.out.print(prompt);
            String response = input.nextLine().trim();

            try {
                int number = Integer.parseInt(response);

                if (number >= minimum && number <= maximum) {
                    return number;
                }

                System.out.println(
                        "Enter a number from "
                        + minimum
                        + " through "
                        + maximum
                        + ".");
            } catch (NumberFormatException error) {
                System.out.println(
                        "Invalid input. Please enter a whole number.");
            }
        }
    }
}