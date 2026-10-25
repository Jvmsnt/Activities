public class ClassStatistics {
    public static void main(String[] args) {
        // Declare an int array of at least 8 student scores
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 89};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        // Compute sum, highest, and lowest 
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
            // yow sir pls gud grade :)))
        // Compute average 
        double average = (double) sum / scores.length;

        // Print 
        System.out.println("--- Class Statistics Calculator ---");
        System.out.println("Total Sum:     " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score:  " + lowest);
    }
}