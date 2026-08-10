/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Abstraction
 *
 * Description:
 * This abstract class represents a board game. It extends Game
 * and stores the maximum move value a player can make. It provides
 * an implementation for ending a turn while leaving the methods
 * for starting the game and starting a turn abstract.
 *******************************************************************/

public abstract class BoardGame extends Game {

    private int MaxMove;

    public BoardGame(String name, int numPlayers, int maxMove) {

        super(name, numPlayers);

        MaxMove = maxMove;
    }

    public int getMaxMove() {
        return MaxMove;
    }

    @Override
    public abstract String startGame();

    @Override
    public abstract String startTurn();

    @Override
    public String endTurn() {
        return "The player's move ends and play passes to the next player.";
    }

    @Override
    public String toString() {

        return super.toString()
                + "Maximum Move Value: " + MaxMove + "\n";
    }
}