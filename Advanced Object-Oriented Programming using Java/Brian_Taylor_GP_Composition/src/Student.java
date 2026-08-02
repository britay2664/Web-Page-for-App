/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Composition
 *
 * This class represents a Student object, which includes the
 * student's Name, Major, and GPA. Getters and setters are provided
 * as is a constructor to set all Student properties. The toString
 * method is overridden to provide a formatted string of the class
 * properties.
 *******************************************************************/

public class Student {

    // Class properties
    private String name;
    private String major;
    private double gpa;

    // Constructor
    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // Returns formatted student information
    @Override
    public String toString() {

        return String.format(
                "%s%s%n%s%s%n%s%.2f%n",
                "Student: ", name,
                "Major: ", major,
                "GPA: ", gpa);
    }
}