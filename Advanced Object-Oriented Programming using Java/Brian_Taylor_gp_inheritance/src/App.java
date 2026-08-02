/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Inheritance
 *
 * Main application class.
 *******************************************************************/
public class App {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Brian Taylor – SDC330 1.3 Guided Practice");
        System.out.println("-----------------------------------------");

        // Student object
        Student student = new Student(
                "John Smith",
                "Any School"
        );

        System.out.println("***** Student class using toString *****");
        System.out.println(student);

        System.out.println(
                "***** Student class using getStudentInformation *****"
        );
        System.out.println(student.getStudentInformation());
        System.out.println();

        // Primary school student object
        PrimarySchoolStudent primaryStudent =
                new PrimarySchoolStudent(
                        "Jane Doe",
                        "Some Elementary School",
                        "Pre-K"
                );

        System.out.println(
                "***** PrimarySchoolStudent class using toString *****"
        );
        System.out.println(primaryStudent);

        System.out.println(
                "***** PrimarySchoolStudent class using "
                        + "getStudentInformation *****"
        );
        System.out.println(primaryStudent.getStudentInformation());
        System.out.println();

        // High school student object
        HighSchoolStudent highSchoolStudent =
                new HighSchoolStudent(
                        "Fred Smythe",
                        "Some High School",
                        10,
                        "Sophomore",
                        true
                );

        System.out.println(
                "***** HighSchoolStudent class using toString *****"
        );
        System.out.println(highSchoolStudent);

        System.out.println(
                "***** HighSchoolStudent class using "
                        + "getStudentInformation *****"
        );

        /*
         * This only displays the name and school because
         * HighSchoolStudent does not override
         * getStudentInformation().
         */
        System.out.println(highSchoolStudent.getStudentInformation());
        System.out.println();

        // College student object
        CollegeStudent collegeStudent =
                new CollegeStudent(
                        "Brian Taylor",
                        "ECPI University",
                        "Computer Science"
                );

        System.out.println(
                "***** CollegeStudent class using toString *****"
        );
        System.out.println(collegeStudent);

        System.out.println(
                "***** CollegeStudent class using "
                        + "getStudentInformation *****"
        );
        System.out.println(collegeStudent.getStudentInformation());
        System.out.println();

        // Undergraduate student object
        UndergraduateStudent undergraduateStudent =
                new UndergraduateStudent(
                        "Brian Taylor",
                        "ECPI University",
                        "Computer Science",
                        "Junior"
                );

        System.out.println(
                "***** UndergraduateStudent class using toString *****"
        );
        System.out.println(undergraduateStudent);

        System.out.println(
                "***** UndergraduateStudent class using "
                        + "getStudentInformation *****"
        );
        System.out.println(
                undergraduateStudent.getStudentInformation()
        );
        System.out.println();

        // Graduate student object
        GraduateStudent graduateStudent =
                new GraduateStudent(
                        "Dean Jones",
                        "Tulane",
                        "Psychology",
                        true
                );

        System.out.println(
                "***** GraduateStudent class using toString *****"
        );
        System.out.println(graduateStudent);

        System.out.println(
                "***** GraduateStudent class using "
                        + "getStudentInformation *****"
        );
        System.out.println(graduateStudent.getStudentInformation());
        System.out.println();
    }
}