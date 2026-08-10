/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Constructors and
 * Access Specifiers
 *
 * Description:
 * This class represents a general car. It stores the fuel type and
 * engine type using private properties. The constructor and setter
 * methods are protected so subclasses can use them, while the
 * getter methods are public.
 *******************************************************************/

public class Car {

    private String Fuel;
    private String Engine;

    protected Car(String fuel, String engine) {
        Fuel = fuel;
        Engine = engine;
    }

    public String getFuel() {
        return Fuel;
    }

    protected void setFuel(String fuel) {
        Fuel = fuel;
    }

    public String getEngine() {
        return Engine;
    }

    protected void setEngine(String engine) {
        Engine = engine;
    }

    @Override
    public String toString() {
        return
            "Fuel Type: " + Fuel + "\n" +
            "Engine Type: " + Engine + "\n";
    }
}