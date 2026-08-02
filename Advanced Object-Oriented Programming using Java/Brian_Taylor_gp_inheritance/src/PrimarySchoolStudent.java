/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Inheritance
 *
 * This class represents a PrimarySchoolStudent object, which extends
 * the Student class by adding the student's grade.
 *******************************************************************/
public class PrimarySchoolStudent extends Student {

    private String grade;

    // Three-parameter constructor
    public PrimarySchoolStudent(String name, String school, String grade) {
        super(name, school);
        this.grade = grade;
    }

    // Getter and setter
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Add grade information to the parent class information
    @Override
    public String getStudentInformation() {
        return String.format(
                "%s%n%s%s",
                super.getStudentInformation(),
                "Student Grade: ", grade
        );
    }

    @Override
    public String toString() {
        return getStudentInformation();
    }
}