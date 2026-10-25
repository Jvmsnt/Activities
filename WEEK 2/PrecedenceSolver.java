public class PrecedenceSolver {
    public static void main(String[] args) {
        int a = 5, b = 10;
        // predicktsyon: true (math happens first, so 10==10 and 20>15)
        boolean expr1 = a + 5 == b && b * 2 > 15;
        System.out.println("Expr 1: " + expr1);

        int x = 3, y = 4;
        // predisyon: 11 (thought x goes to 4 first, then 4*2 + 3)
        int expr2 = x++ * 2 + --y; 
        System.out.println("\nExpr 2: " + expr2);
        // male ako don dipala ako ang gusto, 9 pala.  x++ uses the old value (3) before adding 1.

        int m = 5, n = 5;
        // predict: expr3 is false, and n becomes 6
        boolean expr3 = (m == 6) && (++n == 6);
        System.out.println("\nExpr 3: " + expr3);
        System.out.println("n is now: " + n);
        // got the false right, but n stayed 5. 
    }
}