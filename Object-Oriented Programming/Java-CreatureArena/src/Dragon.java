public class Dragon extends Creature {

    public Dragon(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " breathes a massive stream of fire!");
    }

}