public class Archer extends Character {

    public Archer(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " fires a storm of arrows across the battlefield!");
    }
}