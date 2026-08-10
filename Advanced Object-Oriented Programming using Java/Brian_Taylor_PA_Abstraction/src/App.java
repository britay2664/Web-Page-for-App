/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Abstraction
 *
 * Description:
 * This is the main application class. It creates instances of each
 * concrete game class and displays their information in the console.
 *******************************************************************/

public class App {

    public static void main(String[] args) {

        System.out.println(
            "\nBrian Taylor - Week 3 Abstraction Performance Assessment\n"
        );

        CardGame cardGame =
            new CardGame(
                "Family Battle Cards",
                4,
                7
            );

        DiceGame diceGame =
            new DiceGame(
                "Treasure Race",
                4,
                6
            );

        SpinnerGame spinnerGame =
            new SpinnerGame(
                "Adventure Spinner",
                6,
                10
            );

        System.out.println("===== CARD GAME INFORMATION =====");
        System.out.println(cardGame);

        System.out.println("===== DICE GAME INFORMATION =====");
        System.out.println(diceGame);

        System.out.println("===== SPINNER GAME INFORMATION =====");
        System.out.println(spinnerGame);
    }
}