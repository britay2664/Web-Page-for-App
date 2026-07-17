public class Warrior extends Character {

    public Warrior(String name, int level, int health) {
        super(name, level, health);
    }

    public void attack() {
        System.out.println(name + " swings a mighty sword!");
    }

}