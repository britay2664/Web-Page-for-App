public class Creature {

    String name;
    int health;

    public Creature(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " performs a basic attack.");
    }
}