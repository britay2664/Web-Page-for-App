import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dragon dragon = new Dragon("Smolder", 120);

        Knight knight = new Knight("Sir Codealot", 100);

        Wizard wizard = new Wizard("Arcana", 80);

        ArrayList<Creature> arena = new ArrayList<>();

        arena.add(dragon);
        arena.add(knight);
        arena.add(wizard);

        System.out.println("===== Creature Arena =====");
        System.out.println();

        for (Creature c : arena) {

            c.displayStats();

            c.attack();

            System.out.println();

        }

    }

}