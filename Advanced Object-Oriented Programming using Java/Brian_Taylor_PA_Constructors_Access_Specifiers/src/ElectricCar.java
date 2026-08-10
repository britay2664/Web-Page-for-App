/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Constructors and
 * Access Specifiers
 *
 * Description:
 * This class represents an electric car. It extends the Car class
 * and provides a public no-argument constructor that supplies safe
 * default values for the fuel and engine types.
 *******************************************************************/

public class ElectricCar extends Car {

    public ElectricCar() {
        super("Electricity", "Electric Motor");
    }
}