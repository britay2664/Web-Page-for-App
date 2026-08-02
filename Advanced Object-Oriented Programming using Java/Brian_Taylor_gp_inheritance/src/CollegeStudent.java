/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Inheritance
 *
 * This class represents a CollegeStudent object, which extends the
 * Student class by adding the student's major. This class also acts
 * as the parent class for UndergraduateStudent and GraduateStudent.
 *******************************************************************/
public class CollegeStudent extends Student {

    private String major;

    // Three-parameter constructor
    public CollegeStudent(String name, String school, String major) {
        super(name, school);
        this.major = major;
    }

    // Getter and setter
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getStudentInformation() {
        return String.format(
                "%s%n%s%s",
                super.getStudentInformation(),
                "Student Major: ", major
        );
    }

    @Override
    public String toString() {
        return String.format(
                "%s%n%s%s",
                super.toString(),
                "Student Major: ", major
        );
    }
}