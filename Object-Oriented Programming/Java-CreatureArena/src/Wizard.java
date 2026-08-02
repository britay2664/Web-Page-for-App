public class Wizard extends Creature {

    public Wizard(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a powerful lightning spell!");
    }

}