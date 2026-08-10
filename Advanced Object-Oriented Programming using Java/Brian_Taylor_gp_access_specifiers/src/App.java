/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Week 3 GP – Access Specifiers
 *
 * Main application class.
 *******************************************************************/

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println(
            "\nBrian Taylor, Week 3 Access Specifiers GP\n"
        );

        // Create a Person reference using a Student object

        Person person =
            new Student(
                "John Smith",
                22,
                "js@mail.com",
                2022
            );

        // Print using Student's overridden toString()

        System.out.println(
            "Person printed using Student's toString"
        );

        System.out.println(person);

        person.setAge(43.5);

        // Print using Person getters

        System.out.println(
            "Person printed using Person getters"
        );

        System.out.println(
            "Name: " + person.getName()
        );

        System.out.println(
            "Age: " + person.getAge()
        );

        System.out.println(
            "EMail: " + person.getEmail()
        );

        // Create Student object directly

        Student student =
            new Student(
                "Jane Jones",
                19,
                "jj@mail.com",
                2023
            );

        System.out.println(
            "\nStudent printed using Student's toString"
        );

        System.out.println(student);

        // Update student information

        student.updateName(
            "Jane Smith-Jones"
        );

        student.updateAge(
            21.1
        );

        student.updateEmail(
            "jsj@mail.com"
        );

        student.setGradYear(
            2023
        );

        // Print information using getters

        System.out.println(
            "Student printed using Student & Person getters"
        );

        System.out.println(
            "Name: " + student.getName()
        );

        System.out.println(
            "Age: " + student.getAge()
        );

        System.out.println(
            "EMail: " + student.getEmail()
        );

        System.out.println(
            "Graduation Year: " + student.getGradYear()
        );
    }
}