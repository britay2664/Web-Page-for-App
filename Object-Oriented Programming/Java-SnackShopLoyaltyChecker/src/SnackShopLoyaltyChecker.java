// Author: Brian Taylor
// 06/24/2026
// Snack Shop Loyalty Checker
// This program calculates the discount for a customer based on their purchase amount.

import java.util.Scanner;

public class SnackShopLoyaltyChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for customer information
        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();

        System.out.print("Enter purchase amount: $");
        double purchaseAmount = input.nextDouble();

        // Get discount percentage from method
        double discountPercent = getDiscountPercent(purchaseAmount);

        // Calculate discount amount and final total
        double discountAmount = purchaseAmount * discountPercent;
        double finalTotal = purchaseAmount - discountAmount;

        // Display summary
        System.out.println("\nCustomer: " + customerName);
        System.out.printf("Purchase Amount: $%.2f%n", purchaseAmount);
        System.out.printf("Discount: %.0f%%%n", discountPercent * 100);
        System.out.printf("Final Total: $%.2f%n", finalTotal);

        input.close();
    }

    public static double getDiscountPercent(double purchaseAmount) {

        if (purchaseAmount < 10.00) {
            return 0.00;
        }
        else if (purchaseAmount < 20.00) {
            return 0.10;
        }
        else {
            return 0.15;
        }
    }
}