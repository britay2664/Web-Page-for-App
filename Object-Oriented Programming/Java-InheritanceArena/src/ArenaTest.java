public class ArenaTest {

    public static void main(String[] args) {

        Warrior hero = new Warrior("Thorn", 8, 150);
        Mage wizard = new Mage("Lyra", 10, 90);
        Rogue thief = new Rogue("Shade", 9, 120);

        hero.attack();
        wizard.castSpell();
        thief.stealth();
    }
}