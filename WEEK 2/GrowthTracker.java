public class GrowthTracker {
        // yow sir pls sana pasadooo :)))
    public static void main(String[] args) {
        double balance = 1000.0;
    
        balance += 500.0;
        System.out.println("After deposit: PHP " + balance);
        
        balance *= 1.05; 
        System.out.println("After 5% interest: PHP " + balance);
        
        balance += 250.0;
        System.out.println("After 2nd deposit: PHP " + balance);

        System.out.println("\n--- Increment Test ---");
        int count = 10;
        
        System.out.println("Postfix (count++): " + (count++));
        System.out.println("Count is now: " + count);
        
        int count2 = 10;
        System.out.println("\nPrefix (++count2): " + (++count2));
        System.out.println("Count2 is now: " + count2);

        // postfix (count++) prints the original value first then adds 1  more behind the scenes
        // prefix (++count2) adds 1 rn then prints the updated value
    }
}