import java.util.HashMap;
import java.util.Scanner;

public class BitidaRestaurant {
    public static void main(String[] args) {
        
        // Create a HashMap to store the menu items and their prices
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Pizza", 40);
        menu.put("Pasta", 76);
        menu.put("Burger", 98);
        menu.put("Salad", 45);
        menu.put("Coffee", 45); 

        // Print the menu items and their prices
        System.out.println("Welcome to Bitida Restaurant:");
        System.out.println("Pizza: Rs 40\nPasta: Rs 76\nBurger: Rs 98\nSalad: Rs 45\nCoffee: Rs 45");

        // Initialize a variable to keep track of the total order amount    
        int orderTotal = 0;

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Start a loop to allow the user to add items to their order
        while (true) {
            // Prompt the user to enter the name of the item they want to order
            System.out.print("Enter the name of the item you want to order: ");
            String item = sc.nextLine();

            // Check if the entered item is available in the menu
            if (menu.containsKey(item)) {

                 // If the item is available, add its price to the order total
                orderTotal += menu.get(item);

                // Inform the user that the item has been added to their order
                System.out.printf("Your item %s has been added to your order%n", item);

                // If the item is not available, inform the user
            } else {
                System.out.printf("Ordered item %s is not available yet!%n", item);
            }

            // Ask the user if they want to add another item to their order
            System.out.print("Do you want to add another item? (Yes/No) ");
            String anotherOrder = sc.nextLine();

            // If the user enters anything other than "Yes", break the loop
            if (!anotherOrder.equalsIgnoreCase("Yes")) {
                break;
            }
        }

        // After the loop ends, print the total amount to be paid
        System.out.printf("Thank You For Ordered : \nThe total amount to pay is %d%n", orderTotal);
    }
}
