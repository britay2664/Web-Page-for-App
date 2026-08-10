/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Week 3 GP – Access Specifiers
 *
 * This class demonstrates using public, private, and protected access
 * specifiers. Of note, the protected constructor means that this
 * class cannot be instantiated directly - only a subclass can call
 * this class' constructor. The member variables are not accessible
 * outside of this class. The protected methods are available to
 * subclasses and other classes within the same package as this class.
 *******************************************************************/

public class Person {

    private String Name;
    private double Age;
    private String Email;

    // Protected constructor
    protected Person(String name, double age, String email) {
        Name = name;
        Age = age;
        Email = email;
    }

    // Public getters; protected setters

    public String getName() {
        return Name;
    }

    protected void setName(String name) {
        Name = name;
    }

    public double getAge() {
        return Age;
    }

    protected void setAge(double age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    protected void setEmail(String email) {
        Email = email;
    }
}