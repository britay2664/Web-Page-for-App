public class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }

    public void useSpecialAbility() {
        System.out.println(getName() + " uses a basic ability.");
    }
}