/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Inheritance
 *
 * This class represents a GraduateStudent object, which extends the
 * CollegeStudent class by adding an indicator for whether a thesis
 * is required.
 *******************************************************************/
public class GraduateStudent extends CollegeStudent {

    private boolean thesisRequired;

    // Four-parameter constructor
    public GraduateStudent(
            String name,
            String school,
            String major,
            boolean thesis) {

        super(name, school, major);
        this.thesisRequired = thesis;
    }

    // Getter and setter
    public boolean isThesisRequired() {
        return thesisRequired;
    }

    public void setThesisRequired(boolean thesisRequired) {
        this.thesisRequired = thesisRequired;
    }

    @Override
    public String getStudentInformation() {
        return String.format(
                "%s%n%s%s",
                super.getStudentInformation(),
                "Thesis Required? ", thesisRequired
        );
    }

    @Override
    public String toString() {
        return String.format(
                "%s%n%s%s",
                super.getStudentInformation(),
                "Thesis Required? ", thesisRequired
        );
    }
}