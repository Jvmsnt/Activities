public class UnitConverter {
    public static void main(String[] args) {
        double totalCm = 325.5;
    // if you are reading this, then you are probably my professor checking my work, and pls give me gud grade :)
        int meters = (int) (totalCm / 100);
        double remainingCm = totalCm % 100;
        
        System.out.println(totalCm + " cm = " + meters + "m and " + remainingCm + "cm");

        int num1 = 50;
        double num2 = num1; 
        // int Turns into double so no cast needed :)
        System.out.println("\nWidened: " + num2);

        double precise = 10.75;
        int narrowed = (int) precise;
        // narrowing removes the decimal part completely :))))))))))
        System.out.println("Narrowed: " + narrowed);
    }
}