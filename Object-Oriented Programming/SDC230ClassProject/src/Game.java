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

        items = new ArrayList<Item>();
        characters = new ArrayList<Character>();
        missions = new ArrayList<Mission>();

        createDefaultCharacters();
        createDefaultMissions();
    }

    public void start() {
        System.out.println("=================================");
        System.out.println("      WELCOME TO ADVENTURE");
        System.out.println("=================================");

        createPlayer();

        while (running) {
            showMenu();
            String choice = input.nextLine().trim();
            handleMenuChoice(choice);
        }

        System.out.println("\nThanks for playing, "
                + player.getName() + "!");
        input.close();
    }

    /*
     * Creates the player when the program begins.
     * Empty names are rejected.
     */
    private void createPlayer() {
        System.out.print("Enter your player name: ");
        String playerName = input.nextLine().trim();

        while (playerName.isEmpty()) {
            System.out.println("Player name cannot be empty.");
            System.out.print("Enter your player name: ");
            playerName = input.nextLine().trim();
        }

        player = new Player(playerName);

        System.out.println("\nWelcome, " + player.getName() + "!");
        System.out.println("Your adventure is ready to begin.");
    }

    /*
     * Creates the starting character choices.
     */
    private void createDefaultCharacters() {
        characters.add(new Warrior("Blade", 120));
        characters.add(new Hacker("Cipher", 90));
    }

    /*
     * Creates the missions available during the game.
     */
    private void createDefaultMissions() {
        missions.add(new Mission(
                "Forest Rescue",
                "Rescue a traveler trapped in the forest.",
                1,
                25,
                10,
                "Health Potion"));

        missions.add(new Mission(
                "Security Breach",
                "Stop an enemy from accessing the city network.",
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

    private void showMenu() {
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. View Player Info");
        System.out.println("2. View Characters");
        System.out.println("3. Use Character Abilities");
        System.out.println("4. View Missions");
        System.out.println("5. Send Character on Mission");
        System.out.println("6. View Inventory");
        System.out.println("7. Add Custom Item");
        System.out.println("8. Help");
        System.out.println("9. Exit");
        System.out.print("Choose an option: ");
    }

    private void handleMenuChoice(String choice) {
        switch (choice) {
            case "1":
                player.displayInfo();
                break;

            case "2":
                viewCharacters();
                break;

            case "3":
                useCharacterAbilities();
                break;

            case "4":
                viewMissions();
                break;

            case "5":
                sendCharacterOnMission();
                break;

            case "6":
                viewItems();
                break;

            case "7":
                addItem();
                break;

            case "8":
                showHelp();
                break;

            case "9":
                running = false;
                break;

            default:
                System.out.println(
                        "Invalid option. Enter a number from 1 through 9.");
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
        System.out.println("\n===== CHARACTER ABILITIES =====");

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
                    + " has no health remaining.");

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

        Mission selectedMission =
                missions.get(missionChoice - 1);

        performMission(selectedCharacter, selectedMission);
    }

    /*
     * Runs the selected mission and updates the program state.
     */
    private void performMission(
            Character character,
            Mission mission) {

        System.out.println("\n===== MISSION STARTED =====");
        System.out.println(
                character.getName()
                + " begins "
                + mission.getName()
                + ".");

        character.useSpecialAbility();

        int successChance =
                80 - (mission.getDifficulty() * 15);

        int result = random.nextInt(100) + 1;

        System.out.println("Success chance: "
                + successChance + "%");

        System.out.println("Mission roll: " + result);

        if (result <= successChance) {
            handleMissionSuccess(character, mission);
        } else {
            handleMissionFailure(character, mission);
        }

        displayMissionResults(character);
    }

    private void handleMissionSuccess(
            Character character,
            Mission mission) {

        character.addXp(mission.getXpReward());
        player.addScore(mission.getXpReward());

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
                player.getName()
                + " gained "
                + mission.getXpReward()
                + " score points.");

        System.out.println(
                mission.getItemReward()
                + " was added to the inventory.");
    }

    private void handleMissionFailure(
            Character character,
            Mission mission) {

        character.takeDamage(
                mission.getHealthPenalty());

        System.out.println("\nMISSION FAILED!");

        System.out.println(
                character.getName()
                + " lost "
                + mission.getHealthPenalty()
                + " health.");
    }

    private void displayMissionResults(Character character) {
        System.out.println(
                "\n===== UPDATED GAME STATE =====");

        character.displayInfo();

        System.out.println(
                "Player Score: "
                + player.getScore());

        System.out.println(
                "Inventory Items: "
                + items.size());

        if (character.getHealth() == 0) {
            System.out.println(
                    character.getName()
                    + " can no longer complete missions.");
        }
    }

    private void addItem() {
        System.out.print("Enter item name: ");
        String name = input.nextLine().trim();

        while (name.isEmpty()) {
            System.out.println(
                    "Item name cannot be empty.");

            System.out.print("Enter item name: ");
            name = input.nextLine().trim();
        }

        System.out.print("Enter item description: ");
        String description = input.nextLine().trim();

        while (description.isEmpty()) {
            System.out.println(
                    "Item description cannot be empty.");

            System.out.print("Enter item description: ");
            description = input.nextLine().trim();
        }

        items.add(new Item(name, description));

        System.out.println("Item added successfully!");
    }

    private void viewItems() {
        if (items.isEmpty()) {
            System.out.println(
                    "Your inventory is currently empty.");

            return;
        }

        System.out.println("\n===== INVENTORY =====");

        for (int i = 0; i < items.size(); i++) {
            System.out.println("Item #" + (i + 1));
            items.get(i).displayItem();
            System.out.println("--------------------");
        }
    }

    private void showHelp() {
        System.out.println("\n===== HELP =====");
        System.out.println(
                "Select menu options using the numbers shown.");

        System.out.println(
                "Send characters on missions to earn XP and score.");

        System.out.println(
                "Successful missions add reward items to inventory.");

        System.out.println(
                "Failed missions reduce character health.");
    }

    /*
     * Reads and validates whole-number input.
     */
    private int readNumber(
            String prompt,
            int minimum,
            int maximum) {

        while (true) {
            System.out.print(prompt);
            String response = input.nextLine().trim();

            try {
                int number = Integer.parseInt(response);

                if (number >= minimum
                        && number <= maximum) {

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
                        "Invalid input. Enter a whole number.");
            }
        }
    }
}