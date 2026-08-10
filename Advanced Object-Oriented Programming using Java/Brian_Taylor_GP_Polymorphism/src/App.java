/*******************************************************************
 * Name: Brian Taylor
 * Date: August 5, 2026
 * Assignment: SDC330 Week 2 GP – Polymorphism
 *
 * Main application class.
 */

import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("\nBrian Taylor, Week 2 Polymorphism GP\n");

        Food food = new Food(
            "Food Class",
            "Undefined"
        );

        Vegetable veg = new Vegetable(
            "Romaine Lettuce",
            "3 cups",
            "Spring",
            "Summer"
        );

        Corn corn = new Corn(
            "One Ear",
            "Spring",
            "Summer/Fall",
            "Silver Queen Sweet",
            "4 ears per tray"
        );

        Meat meat = new Meat(
            "Angus Beef",
            "6 oz",
            "Free Range Grass Fed"
        );

        // The ArrayList type is Food, but polymorphism allows
        // objects from classes that extend Food to be added.

        ArrayList<Food> foods = new ArrayList<Food>();

        foods.add(food);
        foods.add(veg);
        foods.add(corn);
        foods.add(meat);

        System.out.println("Items in foods ArrayList:\n");

        for (Food f : foods) {
            printFoodInfo(f);
        }

        // This list accepts Vegetable objects and objects from
        // classes that extend Vegetable, such as Corn.

        ArrayList<Vegetable> veggies = new ArrayList<>();

        veggies.add(veg);
        veggies.add(corn);

        // These lines would cause compiler errors:
        // veggies.add(food);
        // veggies.add(meat);

        System.out.println("Items in veggies ArrayList:\n");

        for (Vegetable v : veggies) {
            printFoodInfo(v);
        }
    }

    private static void printFoodInfo(Food food) {
        System.out.println(food.toString());
    }
}