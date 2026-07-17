public class CharacterTest {

    public static void main(String[] args) {

        Character hero = new Character("Aria", 5, 100);

        hero.setLevel(10);
        hero.setHealth(120);

        // Invalid value
        hero.setHealth(-50);

        System.out.println("Name: " + hero.getName());
        System.out.println("Level: " + hero.getLevel());
        System.out.println("Health: " + hero.getHealth());

    }

}