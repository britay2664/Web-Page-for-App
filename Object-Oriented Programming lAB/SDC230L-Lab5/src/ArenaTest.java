import java.util.ArrayList;

public class ArenaTest {

    public static void main(String[] args) {

        ArrayList<Creature> arena = new ArrayList<>();

        arena.add(new Dragon("Smolder", 120, 8));
        arena.add(new Knight("Sir Codealot", 100, 6));
        arena.add(new Wizard("Arcana", 80, 9));
        arena.add(new Goblin("Grimfang", 65, 5));

        System.out.println("=================================");
        System.out.println("       CREATURE ARENA BATTLE");
        System.out.println("=================================");
        System.out.println();

        System.out.println("Arena Fighter Roster:");
        System.out.println();

        for (Creature creature : arena) {
            creature.displayStats();
            System.out.println();
        }

        System.out.println("=================================");
        System.out.println("          BATTLE BEGINS");
        System.out.println("=================================");
        System.out.println();

        int round = 1;

        for (Creature creature : arena) {
            System.out.println("Round " + round + ":");
            creature.attack();
            System.out.println();
            round++;
        }

        System.out.println("=================================");
        System.out.println("       ARENA BATTLE COMPLETE");
        System.out.println("=================================");
    }

    /*
     * Reflection:
     *
     * 1. How did inheritance help you organize your code?
     *
     * Inheritance helped organize my code by allowing the Dragon, Knight,
     * Wizard, and Goblin classes to share common variables and methods from
     * the Creature superclass. This prevented me from rewriting the same
     * name, health, level, constructor, and displayStats code in every class.
     *
     * 2. How did polymorphism allow your program to behave differently
     * for each object?
     *
     * Polymorphism allowed every object to be stored inside one
     * ArrayList<Creature> while still using its own version of the attack()
     * method. When the loop called creature.attack(), Java automatically
     * selected the correct overridden method based on the actual object type.
     */
}