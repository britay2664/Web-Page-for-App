/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Performance Assessment - Interface
 *
 * Main application class. Creates Car and CargoTruck objects and
 * demonstrates interface-based polymorphism by storing both vehicle
 * types in an ArrayList of Vehicle and passing them to a shared
 * print method.
 */

import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println(
            "\nBrian Taylor - Week 2 Interface Performance Assessment\n"
        );

        // Create two Car objects
        Car car1 = new Car(
            "Honda",
            "Accord"
        );

        Car car2 = new Car(
            "Cadillac",
            "Escalade"
        );

        // Create two CargoTruck objects
        CargoTruck truck1 = new CargoTruck(
            "Freightliner",
            "Cascadia",
            "8 cubic tons"
        );

        CargoTruck truck2 = new CargoTruck(
            "Kenworth",
            "T680",
            "10 cubic tons"
        );

        // Start all four vehicles
        car1.start();
        car2.start();
        truck1.start();
        truck2.start();

        // Stop one vehicle
        car2.stop();

        // Assign different destinations
        car1.drive("Virginia Beach");

        car2.drive("Downtown Norfolk");

        truck1.drive("Port of Virginia");

        truck2.drive("Chesapeake");

        // Create ArrayList of Vehicle
        ArrayList<Vehicle> vehicles =
            new ArrayList<Vehicle>();

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(truck1);
        vehicles.add(truck2);

        // Print ArrayList
        System.out.println(
            "Vehicles in Vehicle ArrayList:\n"
        );

        for (Vehicle vehicle : vehicles) {
            printVehicleInfo(vehicle);
        }

        // Print each vehicle individually
        System.out.println(
            "Vehicles Printed Individually:\n"
        );

        System.out.println("Car 1:");
        printVehicleInfo(car1);

        System.out.println("Car 2:");
        printVehicleInfo(car2);

        System.out.println("Cargo Truck 1:");
        printVehicleInfo(truck1);

        System.out.println("Cargo Truck 2:");
        printVehicleInfo(truck2);
    }

    private static void printVehicleInfo(Vehicle vehicle) {

        System.out.println(
            vehicle.toString()
        );
    }
}