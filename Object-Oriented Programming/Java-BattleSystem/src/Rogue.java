public class Rogue extends Character {

    public Rogue(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " disappears into the shadows and strikes from behind!");
    }
}