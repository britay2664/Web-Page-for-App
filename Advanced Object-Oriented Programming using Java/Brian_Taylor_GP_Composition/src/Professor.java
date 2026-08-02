/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Composition
 *
 * This class represents a Professor object, which includes the
 * professor's Name, Title, and Department. Getters and setters are
 * provided as is a constructor to set all Professor properties. The
 * toString is NOT overridden - classes using this class will have
 * to provide their own format using the get methods.
 *******************************************************************/

public class Professor {

    // Class properties
    private String name;
    private String title;
    private String department;

    // Constructor
    public Professor(String name, String title, String department) {
        this.name = name;
        this.title = title;
        this.department = department;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}