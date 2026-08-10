/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Week 2 GP – Interface
 *
 * Main application class.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println(
            "\nBrian Taylor, Week 2 Interface GP\n"
        );

        // Animal animal = new Animal();
        // Error - cannot instantiate an interface

        Dog dog1 = new Dog(
            "Fido",
            "Chasing squirrels"
        );

        Dog dog2 = new Dog(
            "Rex",
            "Sleeping in the sun"
        );

        Cat cat1 = new Cat("Felix");

        Cat cat2 = new Cat("Garfield");

        ArrayList<Animal> animals =
            new ArrayList<Animal>(
                Arrays.asList(
                    dog1,
                    dog2,
                    cat1,
                    cat2
                )
            );

        System.out.println(
            "Animals printed from ArrayList"
        );

        for (Animal animal : animals) {

            printAnimal(animal);

            System.out.println();
        }

        System.out.println(
            "Animals printed directly"
        );

        printAnimal(dog1);

        dog1.move(
            "porch",
            "yard"
        );

        System.out.println();

        printAnimal(dog2);

        dog2.move(
            "floor",
            "bed"
        );

        System.out.println();

        printAnimal(cat1);

        cat1.move(
            "window sill",
            "kitchen counter"
        );

        System.out.println();

        printAnimal(cat2);

        cat2.move(
            "back of the sofa",
            "laundry basket"
        );

        System.out.println();
    }

    private static void printAnimal(Animal animal) {

        System.out.print(animal);

        System.out.print(
            "Says: "
            + animal.makeSound()
            + "\n"
        );
    }
}