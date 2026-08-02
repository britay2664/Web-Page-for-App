import java.util.ArrayList;

public class CreatureTest {

    public static void main(String[] args) {

        Dragon dragon = new Dragon("Smolder", 150);
        Knight knight = new Knight("Sir Valor", 120);

        ArrayList<Creature> creatures = new ArrayList<>();

        creatures.add(dragon);
        creatures.add(knight);

        System.out.println("===== Fantasy Academy Arena =====");
        System.out.println();

        for (Creature creature : creatures) {
            System.out.println("Name: " + creature.name);
            System.out.println("Health: " + creature.health);
            creature.attack();
            System.out.println();
        }
    }
}