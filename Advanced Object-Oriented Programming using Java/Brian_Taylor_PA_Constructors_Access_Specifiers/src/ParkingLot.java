/*******************************************************************
 * Name: Brian Taylor
 * Date: August 10, 2026
 * Assignment: SDC330 Performance Assessment - Constructors and
 * Access Specifiers
 *
 * Description:
 * This class represents a parking lot that contains Car objects.
 * It uses an ArrayList to store cars and provides public methods
 * for accessing the list and adding cars to the parking lot.
 *******************************************************************/

import java.util.ArrayList;

public class ParkingLot {

    private ArrayList<Car> Cars = new ArrayList<Car>();

    public ArrayList<Car> getCars() {
        return Cars;
    }

    public void addCar(Car car) {
        Cars.add(car);
    }
}