public class Rogue extends Character {

    public Rogue(String name, int level, int health) {
        super(name, level, health);
    }

    public void stealth() {
        System.out.println(name + " disappears into the shadows!");
    }
}