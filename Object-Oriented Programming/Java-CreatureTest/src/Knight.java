public class Knight extends Creature {

    public Knight(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " charges forward and swings a powerful sword!");
    }
}
