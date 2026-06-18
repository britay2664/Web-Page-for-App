import java.util.Scanner;



public class CoffeeOrderHelper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("How many coffees would you like? ");
        int quantity = input.nextInt();

        double price = 4.50;
        double total = quantity * price;

        if (quantity >= 3) {
            total = total * 0.90;
        }

        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("Customer: " + name);
        System.out.println("Coffees Ordered: " + quantity);
        System.out.printf("Total Cost: $%.2f%n", total);
        System.out.println("=========================");

        input.close();
    }
}

