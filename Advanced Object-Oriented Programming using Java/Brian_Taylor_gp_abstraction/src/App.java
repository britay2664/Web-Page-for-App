/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Week 3 GP – Abstraction
 *
 * Main application class.
 *******************************************************************/

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("\nBrian Taylor, Week 3 Abstraction GP\n");

        // Can't instantiate abstract classes.
        // Shape shape = new Shape();

        // Shape reference using concrete objects.
        Shape shape = new Square("Orange", "Red", 5.0);
        System.out.println(shape);

        shape = new Rectangle("Green", "Black", 5.5, 2.5);
        System.out.println(shape);

        shape = new Rhombus("Purple", "Red", 1.7, 3);
        System.out.println(shape);

        shape = new Circle("Blue", "Red", 3.4);
        System.out.println(shape);

        // Create objects directly.
        Square square =
            new Square("Chartreuse", "Forest Green", 11.2);

        System.out.println(square);

        Rectangle rect =
            new Rectangle("Grey", "Gray", 3.2, 5.5);

        System.out.println(rect);

        Rhombus para =
            new Rhombus("Yellow", "Orange", 2.9, 4.7);

        System.out.println(para);

        Circle circle =
            new Circle("Cyan", "Brown", 1.234);

        System.out.println(circle);
    }
}