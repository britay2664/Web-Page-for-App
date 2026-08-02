/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Inheritance
 *
 * This class represents a Student object, which is the ultimate
 * superclass in this exercise. All other classes extend this class
 * at some level. This class includes Name and SchoolName properties,
 * as well as getters and setters for those properties.
 *******************************************************************/
public class Student {

    // Class properties
    private String name;
    private String schoolName;

    // Two-parameter constructor
    public Student(String name, String school) {
        this.name = name;
        this.schoolName = school;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for school name
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // Return formatted student information
    public String getStudentInformation() {
        return String.format(
                "%s%s%n%s%s",
                "Student Name: ", name,
                "School Name: ", schoolName
        );
    }

    // Return a string representation of the student
    @Override
    public String toString() {
        return getStudentInformation();
    }
}