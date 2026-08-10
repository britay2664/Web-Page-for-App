/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Performance Assessment - Polymorphism
 *
 * Main application class. Creates instances of Building,
 * Condominium, House, and SplitLevel and demonstrates polymorphism
 * through ArrayLists and a shared print method.
 */

import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println(
            "\nBrian Taylor - Week 2 Polymorphism Performance Assessment\n"
        );

        Building building = new Building(
            "100 Granby Street",
            4,
            "Brick"
        );

        Condominium condominium = new Condominium(
            "250 Waterside Drive",
            8,
            "Concrete",
            32
        );

        House house = new House(
            "721 Chesapeake Boulevard",
            2,
            "Vinyl Siding",
            "Blue",
            7
        );

        SplitLevel splitLevel1 = new SplitLevel(
            "111 Ocean View Avenue",
            "Brick",
            "Gray",
            8,
            true
        );

        SplitLevel splitLevel2 = new SplitLevel(
            "525 Hampton Boulevard",
            "Vinyl Siding",
            "White",
            6,
            false
        );

        // ArrayList containing all Building types
        ArrayList<Building> buildings =
            new ArrayList<Building>();

        buildings.add(building);
        buildings.add(condominium);
        buildings.add(house);
        buildings.add(splitLevel1);
        buildings.add(splitLevel2);

        // ArrayList containing only House objects
        // and classes that extend House
        ArrayList<House> houses =
            new ArrayList<House>();

        houses.add(house);
        houses.add(splitLevel1);
        houses.add(splitLevel2);

        System.out.println(
            "Buildings in Building ArrayList:\n"
        );

        for (Building b : buildings) {
            printBuildingInfo(b);
        }

        System.out.println(
            "Houses in House ArrayList:\n"
        );

        for (House h : houses) {
            printBuildingInfo(h);
        }
    }

    private static void printBuildingInfo(Building building) {

        System.out.println(
            building.toString()
        );
    }
}