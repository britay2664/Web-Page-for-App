/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Week 3 GP – Abstraction
 *
 * This class extends the Quadrilateral class and provides a concrete
 * implementation of the areaFormula method and an override of the
 * area method. The area method is overridden as the area of a
 * rhombus is (diag1 * diag2)/2.
 *******************************************************************/

public class Rhombus extends Quadrilateral {

    public Rhombus(String fillColor, String lineColor,
                   double d1, double d2) {

        super(fillColor, lineColor, d1, d2);
    }

    public String areaFormula() {
        return "One-half Diagonal 1 times Diagonal 2 (d1 × d2)/2.";
    }

    @Override
    public double area() {
        return super.area() / 2;
    }
}