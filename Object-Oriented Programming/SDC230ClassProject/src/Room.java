public class Room {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void displayRoom() {
        System.out.println("\nLocation: " + name);
        System.out.println(description);
    }
}