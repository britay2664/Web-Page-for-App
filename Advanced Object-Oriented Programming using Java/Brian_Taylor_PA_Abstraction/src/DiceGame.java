/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Abstraction
 *
 * Description:
 * This class represents a board game that uses dice. It extends
 * BoardGame and provides specific implementations for starting
 * the game and starting each player's turn.
 *******************************************************************/

public class DiceGame extends BoardGame {

    public DiceGame(String name, int numPlayers, int maxMove) {

        super(name, numPlayers, maxMove);
    }

    @Override
    public String startGame() {
        return "Each player rolls the dice. The highest roll goes first.";
    }

    @Override
    public String startTurn() {
        return "The player rolls the dice and moves up to "
                + getMaxMove() + " spaces.";
    }
}