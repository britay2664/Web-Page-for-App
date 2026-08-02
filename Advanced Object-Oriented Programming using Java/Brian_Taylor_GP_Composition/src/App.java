/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Week 1 GP – Composition
 *
 * Main application class.
 *******************************************************************/

public class App {

    public static void main(String[] args) {

        // Create three students for the classrooms
        Student student1 = new Student(
                "John Doe",
                "Psychology",
                3.95
        );

        Student student2 = new Student(
                "Jane Smith",
                "Biology",
                3.28
        );

        Student student3 = new Student(
                "Brian Taylor",
                "Software Development",
                4.0
        );

        // Create the first college class.
        // The Professor object is created directly inside the constructor.
        CollegeClass class1 = new CollegeClass(
                "ENG123",
                "Intro to Poetry",
                new Professor(
                        "Robert Frost",
                        "Dr.",
                        "English"
                )
        );

        // Create a Professor separately for the second college class
        Professor professor = new Professor(
                "James Gosling",
                "Professor",
                "CIS"
        );

        CollegeClass class2 = new CollegeClass(
                "CIS319",
                "Java Programming",
                professor
        );

        // Add students to the poetry class
        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);

        class1.addStudent(
                "Jimmy Smith",
                "Chemistry",
                2.56
        );

        class1.addStudent(
                new Student(
                        "Fred Flintstone",
                        "Archeology",
                        2.3
                )
        );

        // Add students to the Java class
        class2.addStudent(student3);

        class2.addStudent(
                "Rasmus Lerdorf",
                "Web Development",
                3.6
        );

        class2.addStudent(
                new Student(
                        "Ada Lovelace",
                        "Math",
                        3.99
                )
        );

        // Display the original college classes
        System.out.println(
                "\nBrian Taylor - Composition Guided Practice"
        );

        System.out.println(
                "\nCollegeClass class1 Unmodified"
        );
        System.out.print(class1.getInfo());

        System.out.println(
                "\nCollegeClass class2 Unmodified"
        );
        System.out.print(class2.getInfo());

        // Remove Fred Flintstone from class1
        class1.removeStudent("Fred Flintstone");

        System.out.println(
                "\nCollegeClass class1 After Removing Fred"
        );
        System.out.print(class1.getInfo());

        // Demonstrate which classes override toString()
        System.out.println(
                "\nExamples of class objects using toString"
        );

        System.out.print("CollegeClass object: ");
        System.out.println(class1);

        System.out.print("Professor object: ");
        System.out.println(professor);

        System.out.println("Student object:");
        System.out.println(student3);
    }
}