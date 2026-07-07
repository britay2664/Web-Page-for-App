public class Hacker extends Character {

    public Hacker(String name, int health) {
        super(name, health);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " hacks the security system!");
    }
}