/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 *
 * This is the main application class. It creates an instance of
 * Vehicle, Motorized, Bicycle, Car, and Truck. Each object's
 * properties are printed using its overridden toString method.
 * The Car object's inherited and class-specific properties are
 * also printed individually using getter methods.
 *******************************************************************/

public class App {

    public static void main(String[] args) {

        // Required program heading
        System.out.println();
        System.out.println(
                "Brian Taylor - Week 1 Inheritance PA Modes of Transportation"
        );
        System.out.println(
                "---------------------------------------------------------"
        );

        // Create one Vehicle object
        Vehicle vehicle = new Vehicle(
                4,
                "White",
                false,
                5
        );

        // Create one Motorized object
        Motorized motorized = new Motorized(
                4,
                "Black",
                true,
                2,
                "2.6L V6",
                true
        );

        // Create one Bicycle object
        Bicycle bicycle = new Bicycle(
                2,
                "Blue",
                false,
                1,
                21,
                36.5,
                26.0
        );

        // Create one Car object
        Car car = new Car(
                4,
                "Red",
                false,
                5,
                "3.6L V6",
                true,
                true,
                "Large Trunk"
        );

        // Create one Truck object
        Truck truck = new Truck(
                4,
                "Silver",
                true,
                5,
                "5.3L V8",
                true,
                "2-Ton Long Bed",
                true
        );

        // Print each object's properties using toString
        System.out.println();
        System.out.println("***** Vehicle Object *****");
        System.out.println(vehicle.toString());

        System.out.println();
        System.out.println("***** Motorized Object *****");
        System.out.println(motorized.toString());

        System.out.println();
        System.out.println("***** Bicycle Object *****");
        System.out.println(bicycle.toString());

        System.out.println();
        System.out.println("***** Car Object *****");
        System.out.println(car.toString());

        System.out.println();
        System.out.println("***** Truck Object *****");
        System.out.println(truck.toString());

        /*
         * Print the required Car properties using getter methods.
         * They are printed in the exact order listed in the
         * assignment instructions.
         */
        System.out.println();
        System.out.println("***** Car Properties Using Get Methods *****");

        System.out.println("Color: " + car.getColor());
        System.out.println("Number of Seats: " + car.getSeats());
        System.out.println("Engine Size: " + car.getEngine());
        System.out.println(
                "Automatic Transmission: " + car.isAutomatic()
        );
        System.out.println("Sun Roof: " + car.hasSunRoof());
        System.out.println("Storage Capacity: " + car.getStorage());

        System.out.println();
    }
}