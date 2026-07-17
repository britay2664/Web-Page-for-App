public class Character {

    private String name;
    private int level;
    private int health;

    public Character(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public void setLevel(int level) {
        if (level >= 1) {
            this.level = level;
        }
    }

    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        }
    }

}