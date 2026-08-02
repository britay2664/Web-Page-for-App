public class Creature {

    String name;
    int health;
    int level;

    public Creature(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public void attack() {
        System.out.println(name + " makes a basic attack.");
    }

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
    }
}