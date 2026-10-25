public class GradeThreshold {
    public static void main(String[] args) {
        double average = 82.5;
        int absences = 4;

        boolean isPassing = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("Average: " + average);
        System.out.println("Absences: " + absences);

        if (isPassing) {
            System.out.println("Status: PASS");
            System.out.println("Reason: Met standard grade/attendance requirements, or achieved a 90+ exemption.");
        } else {
            System.out.println("Status: FAIL");
            System.out.println("Reason: Failed to meet base grade/attendance, and did not qualify for the 90+ exemption.");
        }
    }
}