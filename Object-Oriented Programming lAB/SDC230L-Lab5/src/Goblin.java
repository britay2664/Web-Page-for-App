public class Goblin extends Creature {

    public Goblin(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack() {
        System.out.println(name + " throws a poisoned dagger from the shadows!");
    }
}