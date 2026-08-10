/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Abstraction
 *
 * Description:
 * This class represents a card game. It extends the Game class
 * and stores the number of cards dealt to each player. It provides
 * specific implementations for starting the game, starting a turn,
 * and ending a turn.
 *******************************************************************/

public class CardGame extends Game {

    private int NumCards;

    public CardGame(String name, int numPlayers, int numCards) {

        super(name, numPlayers);

        NumCards = numCards;
    }

    public int getNumCards() {
        return NumCards;
    }

    @Override
    public String startGame() {
        return "Shuffle the deck and deal " + NumCards
                + " cards to each player.";
    }

    @Override
    public String startTurn() {
        return "The player draws a card and reviews their hand.";
    }

    @Override
    public String endTurn() {
        return "The player discards if needed and play moves to the next player.";
    }

    @Override
    public String toString() {

        return super.toString()
                + "Cards Per Player: " + NumCards + "\n";
    }
}