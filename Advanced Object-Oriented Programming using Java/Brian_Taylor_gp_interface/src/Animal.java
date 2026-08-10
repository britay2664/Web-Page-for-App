/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Week 2 GP – Interface
 *
 * Interface class Animal - defines all methods that classes that
 * implement this interface must implement.
 */

public interface Animal {

    public String getName();

    public String makeSound();

    public void move(String start, String end);
}