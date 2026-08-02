/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Composition
 *
 * This class represents a college class object, which includes the
 * class ID, subject, instructor, and class roster. Getters and
 * setters are provided as is a constructor to set all individual
 * properties. The roster is initialized to an empty list in the
 * constructor and add and remove methods are provided to modify the
 * class roster.
 *
 * The toString method is NOT overridden; however, a getInfo method
 * is included to provide a formatted string of the class properties.
 *******************************************************************/

import java.util.ArrayList;

public class CollegeClass {

    // Class properties
    private String classId;
    private String subject;
    private Professor instructor;
    private ArrayList<Student> roster;

    // Constructor
    public CollegeClass(
            String classId,
            String subject,
            Professor instructor) {

        this.classId = classId;
        this.subject = subject;
        this.instructor = instructor;

        // Start each college class with an empty roster
        this.roster = new ArrayList<Student>();
    }

    // Getters and setters

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Professor getInstructor() {
        return instructor;
    }

    public void setInstructor(Professor instructor) {
        this.instructor = instructor;
    }

    // Return the complete class roster
    public ArrayList<Student> getRoster() {
        return roster;
    }

    // Add an already-created Student object
    public void addStudent(Student student) {
        roster.add(student);
    }

    // Create and add a Student using parameter values
    public void addStudent(
            String name,
            String major,
            double gpa) {

        roster.add(new Student(name, major, gpa));
    }

    // Remove students whose names match the provided name
    public void removeStudent(String name) {
        roster.removeIf(
                student -> student.getName().equals(name)
        );
    }

    // Format the instructor information
    private String formatInstructor() {
        return String.format(
                "Instructor: %s %s from the %s department.%n",
                instructor.getTitle(),
                instructor.getName(),
                instructor.getDepartment()
        );
    }

    // Format all information about the college class
    public String getInfo() {

        String result;

        result = String.format(
                "%s%s%n%s%s%n%s%n%s",
                "Class ID: ", classId,
                "Subject: ", subject,
                "------------------------------------",
                formatInstructor()
        );

        result += "\nCourse Roster:\n";

        // Loop through every student in the roster
        for (Student student : roster) {
            result += student;
            result += "\n";
        }

        return result;
    }
}