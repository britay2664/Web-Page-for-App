public class Mission {
    private String name;
    private String description;
    private int difficulty;
    private int xpReward;
    private int healthPenalty;
    private String itemReward;

    public Mission(
            String name,
            String description,
            int difficulty,
            int xpReward,
            int healthPenalty,
            String itemReward) {

        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.xpReward = xpReward;
        this.healthPenalty = healthPenalty;
        this.itemReward = itemReward;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getXpReward() {
        return xpReward;
    }

    public int getHealthPenalty() {
        return healthPenalty;
    }

    public String getItemReward() {
        return itemReward;
    }

    public void displayMission() {
        System.out.println("Mission: " + name);
        System.out.println("Description: " + description);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("XP Reward: " + xpReward);
        System.out.println("Possible Item Reward: " + itemReward);
    }
}