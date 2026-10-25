import java.util.Scanner;
// matatapos nako :)))
public class WarehouseScanner {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // -1 represents a damaged shelf
        int[][] warehouse = {
            {50, 12, -1},
            {4, -1, 20},
            {8, 2, 15}
        };
        
        int choice;

        do {
            System.out.println("\n--- Warehouse Menu ---");
            System.out.println("1. Total Inventory");
            System.out.println("2. Find First Critical Shelf");
            System.out.println("3. Restock Validation");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                int total = 0;
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        if (warehouse[i][j] == -1) {
                            continue; // skip damaged shelves
                        }
                        total += warehouse[i][j];
                    }
                }
                System.out.println("Total items across all valid shelves: " + total);
                
            } else if (choice == 2) {
                boolean found = false;
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        if (warehouse[i][j] != -1 && warehouse[i][j] < 5) {
                            System.out.println("Critically low shelf found at Row " + i + ", Col " + j + " (Count: " + warehouse[i][j] + ")");
                            found = true;
                            break; 
                        }
                    }
                    if (found) break; // break out of outer loop once found
                }
                if (!found) System.out.println("No critically low shelves found.");
                
            } else if (choice == 3) {
                simulateRestock(scanner);
            }

        } while (choice != 4);
        
        System.out.println("Exiting System...");
        scanner.close();
    }

    public static void simulateRestock(Scanner scanner) {
        while (true) {
            System.out.print("Enter restock amount: ");
            int amount = scanner.nextInt();
            
            if (amount < 0) {
                System.out.println("Invalid amount. Please enter a positive number.");
            } else {
                System.out.println("Successfully processed a restock of " + amount + " items.");
                return; // exits the method completely once valid input is received
            }
        }
    }
}