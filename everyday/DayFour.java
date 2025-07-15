import java.util.Scanner;

public class DayFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fruit name: ");
        String fruit = scanner.nextLine().toLowerCase();

        System.out.print("Enter quantity in kg: ");
        double quantity = scanner.nextDouble();

        double pricePerKg = 0;
        boolean validFruit = true;

        if (fruit.equals("apple")) {
            pricePerKg = 100;
        } else if (fruit.equals("banana")) {
            pricePerKg = 40;
        } else if (fruit.equals("mango")) {
            pricePerKg = 60;
        } else if (fruit.equals("orange")) {
            pricePerKg = 80;
        } else {
            validFruit = false;
        }

        if (!validFruit) {
            System.out.println("Error: Unknown fruit entered.");
        } else {
            double total = pricePerKg * quantity;
            double discount = 0;

            if (total > 1000) {
                discount = 0.15 * total;
            } else if (total > 500) {
                discount = 0.10 * total;
            }

            double finalAmount = total - discount;

            System.out.println("Fruit: " + fruit);
            System.out.println("Quantity: " + quantity + " kg");
            System.out.println("Price per kg: " + pricePerKg);
            System.out.println("Total before discount: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final amount to pay: " + finalAmount);
        }

        scanner.close();
    }
}
