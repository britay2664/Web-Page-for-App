/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Abstraction
 *
 * Description:
 * This abstract class represents a general game. It stores the
 * game's name and number of players. It also defines abstract
 * methods that child classes must use to explain how the game
 * starts and how turns begin and end.
 *******************************************************************/

public abstract class Game {

    private String Name;
    private int NumPlayers;

    public Game(String name, int numPlayers) {
        Name = name;
        NumPlayers = numPlayers;
    }

    public String getName() {
        return Name;
    }

    public int getNumPlayers() {
        return NumPlayers;
    }

    public abstract String startGame();

    public abstract String startTurn();

    public abstract String endTurn();

    @Override
    public String toString() {

        return
            "Game Name: " + Name + "\n" +
            "Number of Players: " + NumPlayers + "\n" +
            "Starting the Game: " + startGame() + "\n" +
            "Starting a Turn: " + startTurn() + "\n" +
            "Ending a Turn: " + endTurn() + "\n";
    }
}