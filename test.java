import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the product name
        System.out.println("Enter the product name: ");
        String productName = scanner.nextLine();

        // Get the product quantity
        System.out.println("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Get the price per unit of the product
        System.out.println("Enter the price per unit: ");
        double price = scanner.nextDouble();

        // Calculate the total cost for the product
        double totalCost = quantity * price;
        System.out.println("Total cost for " + productName + ": Php " + totalCost);

        // Close the scanner
        scanner.close();
    }
}


