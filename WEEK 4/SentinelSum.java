import java.util.Scanner;

public class SentinelSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter numbers to sum (-1 to stop):");
        
        while (true) {
            int input = scanner.nextInt();
            
            if (input == -1) {
                break;
            }
            
            sum += input;
        }
        
        System.out.println("Final total: " + sum);
        scanner.close();
    }
}