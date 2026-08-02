/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Inheritance
 *
 * This class represents an UndergraduateStudent object, which
 * extends the CollegeStudent class by adding the student's year.
 *******************************************************************/
public class UndergraduateStudent extends CollegeStudent {

    private String year;

    // Four-parameter constructor
    public UndergraduateStudent(
            String name,
            String school,
            String major,
            String year) {

        super(name, school, major);
        this.year = year;
    }

    // Getter and setter
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    /*
     * This method creates its own format using inherited getter
     * methods rather than calling super.getStudentInformation().
     */
    @Override
    public String getStudentInformation() {
        return String.format(
                "%s%s%n%s%s%n%s%s%n%s%s",
                "Student Name: ", getName(),
                "College Name: ", getSchoolName(),
                "Student Year: ", year,
                "Student Major: ", getMajor()
        );
    }

    @Override
    public String toString() {
        return getStudentInformation();
    }
}