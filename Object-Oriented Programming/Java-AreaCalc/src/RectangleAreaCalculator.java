public class RectangleAreaCalculator {

    public static void main(String[] args) {

        double length = 10.0;
        double width = 6.0;

        double area = calculateArea(length, width);

        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        System.out.printf("Rectangle Area: %.2f%n", area);
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
}