public class Character {

    String name;
    int level;
    int health;

    public Character(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " makes a basic attack.");
    }
}