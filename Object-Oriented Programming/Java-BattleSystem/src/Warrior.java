public class Warrior extends Character {

    public Warrior(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " slams the enemy with a massive sword strike!");
    }
}