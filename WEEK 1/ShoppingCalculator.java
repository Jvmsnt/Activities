public class ShoppingCalculator {
    public static void main(String[] args) {
        String storeName = "PC Express";
        int quantity = 2;
        double unitPrice = 1250.50;

        double totalCost = quantity * unitPrice;
        // totalCost shouldn't be an int because we need to keep the exact decimal values for currency

        System.out.println("Store: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: Php " + unitPrice);
        System.out.println("Total Cost: Php " + totalCost);
    }
}