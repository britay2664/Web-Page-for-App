/*******************************************************************
 * Name: Brian Taylor
 * Date: July 25, 2026
 * Assignment: SDC330 Performance Assessment - Composition
 *
 * This is the main application class. It creates two Automobile
 * objects, adds Tire objects using both overloaded addTire methods,
 * and prints automobile information using toString, getBasicInfo,
 * and individual getter methods.
 *******************************************************************/

public class App {

    public static void main(String[] args) {

        // Required output heading
        System.out.println();
        System.out.println(
                "Brian Taylor - Week 1 PA Building a Car Using Composition"
        );
        System.out.println(
                "---------------------------------------------------------"
        );

        /*
         * Create the first automobile.
         * The Engine object is created directly inside the
         * Automobile constructor.
         */
        Automobile automobile1 = new Automobile(
                "Cadillac",
                "Escalade ESV",
                "Black",
                "Full-Size SUV",
                new Engine(
                        8,
                        "Unleaded 87 Octane",
                        true
                )
        );

        // Create an Engine separately for the second automobile
        Engine secondEngine = new Engine(
                4,
                "Unleaded 87 Octane",
                true
        );

        // Create the second automobile
        Automobile automobile2 = new Automobile(
                "Honda",
                "Accord",
                "Blue",
                "Sedan",
                secondEngine
        );

        /*
         * Add tires to automobile1 by first creating Tire objects
         * and passing those objects to addTire(Tire).
         */
        Tire tire1 = new Tire(
                "Michelin",
                "275/55R20",
                44,
                32,
                "All Season Radial"
        );

        Tire tire2 = new Tire(
                "Michelin",
                "275/55R20",
                44,
                32,
                "All Season Radial"
        );

        automobile1.addTire(tire1);
        automobile1.addTire(tire2);

        /*
         * Add more tires to automobile1 by passing the tire
         * information directly to the overloaded addTire method.
         */
        automobile1.addTire(
                "Michelin",
                "275/55R20",
                44,
                32,
                "All Season Radial"
        );

        automobile1.addTire(
                "Michelin",
                "275/55R20",
                44,
                32,
                "All Season Radial"
        );

        // Add tires to automobile2 using Tire objects
        automobile2.addTire(
                new Tire(
                        "Continental",
                        "235/45R18",
                        51,
                        32,
                        "All Season Radial"
                )
        );

        automobile2.addTire(
                new Tire(
                        "Continental",
                        "235/45R18",
                        51,
                        32,
                        "All Season Radial"
                )
        );

        // Add tires to automobile2 using parameter values
        automobile2.addTire(
                "Continental",
                "235/45R18",
                51,
                32,
                "All Season Radial"
        );

        automobile2.addTire(
                "Continental",
                "235/45R18",
                51,
                32,
                "All Season Radial"
        );

        // Print one automobile using toString
        System.out.println();
        System.out.println(
                "***** Automobile 1 Using toString *****"
        );
        System.out.println(automobile1.toString());

        // Print one automobile using getBasicInfo
        System.out.println(
                "***** Automobile 2 Using getBasicInfo *****"
        );
        System.out.println(automobile2.getBasicInfo());

        /*
         * Print the required information using getter methods.
         * This section uses automobile1.
         */
        System.out.println();
        System.out.println(
                "***** Automobile 1 Using Getter Methods *****"
        );

        System.out.println(
                "Make: " + automobile1.getMake()
        );

        System.out.println(
                "Model: " + automobile1.getModel()
        );

        System.out.println(
                "Color: " + automobile1.getColor()
        );

        System.out.println(
                "Body Style: " + automobile1.getBodyStyle()
        );

        // Get the Engine object from the Automobile
        Engine engine = automobile1.getEngineInfo();

        System.out.println();
        System.out.println("Engine Information:");

        System.out.println(
                "Number of Cylinders: " + engine.getCylinders()
        );

        System.out.println(
                "Approved Gas Type: " + engine.getGasType()
        );

        System.out.println(
                "Fuel Injected: " + engine.isFuelInjected()
        );

        System.out.println();
        System.out.println("Tire Information:");

        // Loop through every Tire in the Automobile
        int tireNumber = 1;

        for (Tire tire : automobile1.getTires()) {

            System.out.println();
            System.out.println("Tire " + tireNumber + ":");

            System.out.println(
                    "Manufacturer: " + tire.getManufacturer()
            );

            System.out.println(
                    "Tire Size: " + tire.getSize()
            );

            System.out.println(
                    "Maximum Pressure: "
                            + tire.getMaxPressure()
                            + " PSI"
            );

            System.out.println(
                    "Minimum Pressure: "
                            + tire.getMinPressure()
                            + " PSI"
            );

            System.out.println(
                    "Tire Type: " + tire.getType()
            );

            tireNumber++;
        }

        System.out.println();
    }
}