public class Mage extends Character {

    public Mage(String name, int level, int health) {
        super(name, level, health);
    }

    public void castSpell() {
        System.out.println(name + " casts a powerful fireball!");
    }

}