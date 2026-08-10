/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Constructors and
 * Access Specifiers
 *
 * Description:
 * This is the main application class. It creates a parking lot,
 * creates electric and gas-powered cars using different constructors,
 * adds the cars to the parking lot, and displays their information.
 *******************************************************************/

public class App {

    public static void main(String[] args) {

        System.out.println(
            "\nBrian Taylor - Week 3 Constructors and Access Specifiers Performance Assessment\n"
        );

        // Create ParkingLot instance
        ParkingLot parkingLot = new ParkingLot();

        // Create ElectricCar using no-argument constructor
        ElectricCar electricCar = new ElectricCar();

        parkingLot.addCar(electricCar);

        // Create GasCar using two-parameter constructor
        GasCar gasCar1 =
            new GasCar("Premium Gasoline", "V8 Engine");

        parkingLot.addCar(gasCar1);

        // Create GasCar using one-parameter constructor
        GasCar gasCar2 =
            new GasCar("V6 Engine");

        parkingLot.addCar(gasCar2);

        // Print parking lot information
        System.out.println("===== CARS IN THE PARKING LOT =====\n");

        int carNumber = 1;

        for (Car car : parkingLot.getCars()) {

            System.out.println("Car #" + carNumber);
            System.out.println(car);

            carNumber++;
        }
    }
}