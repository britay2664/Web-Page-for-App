/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Constructors and
 * Access Specifiers
 *
 * Description:
 * This class represents a gas-powered car. It extends the Car
 * superclass and demonstrates constructor overloading by providing
 * both a two-parameter constructor and a one-parameter constructor.
 *******************************************************************/

public class GasCar extends Car {

    public GasCar(String fuel, String engine) {
        super(fuel, engine);
    }

    public GasCar(String engine) {
        this("Regular Gasoline", engine);
    }

    public void updateFuel(String fuel) {
        setFuel(fuel);
    }
}