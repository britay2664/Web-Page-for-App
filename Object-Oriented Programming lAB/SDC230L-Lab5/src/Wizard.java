public class Wizard extends Creature {

    public Wizard(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a devastating lightning spell!");
    }
}