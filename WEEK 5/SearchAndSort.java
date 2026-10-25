import java.util.Arrays;
 // sa dsa din to naturo e
public class SearchAndSort {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 89};
        int target = 90;
        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                found = true;
                foundIndex = i;
                break;
            }
        }

        if (found) {
            System.out.println("Target " + target + " found at index " + foundIndex);
        } else {
            System.out.println("Target " + target + " not found.");
        }

        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("\nOriginal: " + Arrays.toString(scores));
        System.out.println("Sorted:   " + Arrays.toString(sortedScores));

        // Sorting a copy keeps the original index positions intact so we don't lose track of which score belongs to who
    }
}