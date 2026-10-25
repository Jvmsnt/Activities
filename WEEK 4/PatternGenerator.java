public class PatternGenerator {
    public static void main(String[] args) {
        int size = 6;

        for (int i = 1; i <= size; i++) {
            if (i == 4) {
                continue; // demonstrates continue  This skips row 4 completely
            }

            for (int j = 1; j <= size; j++) {
                if (j == i) {
                    break; // demonstrates break This stops the inner loop early to make a triangle shape
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}