/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Inheritance
 *
 * This class represents a HighSchoolStudent object, which extends
 * the Student class by adding the student's grade, class name, and
 * an indicator of whether the student is in college prep.
 *******************************************************************/
public class HighSchoolStudent extends Student {

    private int grade;
    private String className;
    private boolean isCollegePrep;

    // Five-parameter constructor
    public HighSchoolStudent(
            String name,
            String school,
            int grade,
            String className,
            boolean collegePrep) {

        super(name, school);
        this.grade = grade;
        this.className = className;
        this.isCollegePrep = collegePrep;
    }

    // Getters and setters
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean isCollegePrep() {
        return isCollegePrep;
    }

    public void setCollegePrep(boolean collegePrep) {
        this.isCollegePrep = collegePrep;
    }

    /*
     * This class does not override getStudentInformation().
     * Therefore, calls to that method use the Student version.
     */

    @Override
    public String toString() {
        return String.format(
                "%s%n%s%d%n%s%s%n%s%s",
                getStudentInformation(),
                "Student Grade: ", grade,
                "Student Class: ", className,
                "College Prep? ", isCollegePrep
        );
    }
}