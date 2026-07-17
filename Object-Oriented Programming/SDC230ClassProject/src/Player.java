public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public int getScore() {
        return score;
    }

    public void addScore(int amount) {
        if (amount > 0) {
            score += amount;
        }
    }

    public void displayInfo() {
        System.out.println("\n===== PLAYER INFO =====");
        System.out.println("Player Name: " + name);
        System.out.println("Score: " + score);
    }
}