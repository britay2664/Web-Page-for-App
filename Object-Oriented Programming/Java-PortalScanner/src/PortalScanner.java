// Author: Brian Taylor
// Date: 2026-06-24
// Description: This program simulates a scanner that detects the nature of a number emerging from a portal. It classifies the number as positive, negative, or zero and outputs the corresponding realm.


import java.util.Scanner;

public class PortalScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A number emerges from the portal... enter its value: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The scanner detects: POSITIVE REALM.");
        } 
        else if (number < 0) {
            System.out.println("The scanner detects: NEGATIVE REALM.");
        } 
        else {
            System.out.println("The scanner detects: THE VOID.");
        }

        input.close();
    }
}