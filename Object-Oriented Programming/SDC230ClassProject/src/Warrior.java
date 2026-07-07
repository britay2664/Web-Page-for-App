public class Warrior extends Character {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " swings a powerful sword attack!");
    }
}