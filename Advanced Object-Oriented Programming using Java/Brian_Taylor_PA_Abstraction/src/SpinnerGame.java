/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Abstraction
 *
 * Description:
 * This class represents a board game that uses a spinner. It extends
 * BoardGame and provides specific implementations for starting the
 * game and starting each player's turn.
 *******************************************************************/

public class SpinnerGame extends BoardGame {

    public SpinnerGame(String name, int numPlayers, int maxMove) {

        super(name, numPlayers, maxMove);
    }

    @Override
    public String startGame() {
        return "Each player spins once. The highest spin goes first.";
    }

    @Override
    public String startTurn() {
        return "The player spins and moves up to "
                + getMaxMove() + " spaces.";
    }
}