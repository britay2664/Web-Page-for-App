/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Week 2 GP – Interface
 *
 * Cat class implements the Animal interface, providing the required
 * overrides of all of Animal's methods. Class properties are
 * included to support the interface methods. No additional
 * functionality beyond what the interface requires is provided.
 */

public class Cat implements Animal {

    private String Name;

    public Cat(String name) {
        Name = name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String makeSound() {
        return "Meow Meow Meow Meow";
    }

    @Override
    public void move(String start, String end) {
        System.out.println(
            "Leaping from " + start + " to " + end
        );
    }

    @Override
    public String toString() {
        return String.format(
            "Cat Information:%nName: %s%n",
            Name
        );
    }
}