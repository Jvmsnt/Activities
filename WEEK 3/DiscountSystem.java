public class DiscountSystem {
    public static void main(String[] args) {
        double purchaseAmount = 1000;
        double discount = 0.0;

        if (purchaseAmount >= 5000) {
            discount = 0.15; 
        } else if (purchaseAmount >= 2500) {
            discount = 0.10; 
        } else if (purchaseAmount >= 1000) {
            discount = 0.05; 
        } else {
            discount = 0.0;  
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discount);

        System.out.println("Purchase Amount: PHP " + purchaseAmount);
        System.out.println("Discount Tier: " + (discount * 100) + "%");
        System.out.println("Final Price: PHP " + finalPrice);
    }
}