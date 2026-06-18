public class Player {
    private String name;
    private int health;

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public void displayInfo() {
        System.out.println("\n===== PLAYER INFO =====");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }
}