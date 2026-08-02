public class Dragon extends Creature {

    public Dragon(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack() {
        System.out.println(name + " breathes a massive wave of fire!");
    }
}