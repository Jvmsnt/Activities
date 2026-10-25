class Student {
    String name;
    int[] quizzes;
    double average;

    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        
        int sum = 0;
        for (int score : quizzes) {
            sum += score;
        }
        this.average = (double) sum / quizzes.length;
    }
}

public class ClassRankingSystem {
    public static void main(String[] args) {
        String[] names = {"Lebron", "Darrel", "Jhan", "Ezralyn", "Sven"};
        int[][] rawQuizData = {
            {90, 92, 88, 95},
            {80, 85, 90, 85}, 
            {95, 98, 99, 96}, 
            {88, 82, 86, 84}, 
            {70, 75, 72, 78}  
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

        // Selection sort
        for (int i = 0; i < students.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].average > students[maxIdx].average) {
                    maxIdx = j;
                }
            }
            Student temp = students[maxIdx];
            students[maxIdx] = students[i];
            students[i] = temp;
        }

        System.out.println("--- Leaderboard ---");
        int currentRank = 1;
        
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average < students[i - 1].average) {
                currentRank = i + 1; 
            }
            
            String tie = (i > 0 && students[i].average == students[i - 1].average) ? "(Tie)" : "";
            System.out.printf("%d | %s | %.2f %s\n", currentRank, students[i].name, students[i].average, tie);
        }

        String target = "Ezralyn";
        int rank = findRank(students, target);
        
        System.out.println("\nSearch:");
        if (rank != -1) {
            System.out.println(target + "'s rank is " + rank);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static int findRank(Student[] students, String target) {
        int rank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average < students[i - 1].average) {
                rank = i + 1; 
            }
            if (students[i].name.equals(target)) {
                return rank;
            }
        }
        return -1; 
    }
}