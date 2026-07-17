public class Character {
    private String name;
    private int health;
    private int xp;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.xp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        if (xp < 0) {
            this.xp = 0;
        } else {
            this.xp = xp;
        }
    }

    public void addXp(int amount) {
        if (amount > 0) {
            xp += amount;
        }
    }

    public void takeDamage(int amount) {
        if (amount > 0) {
            health -= amount;

            if (health < 0) {
                health = 0;
            }
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("XP: " + xp);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses a basic ability.");
    }
}