public class Mage extends Character {

    public Mage(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " hurls a blazing fireball across the arena!");
    }
}