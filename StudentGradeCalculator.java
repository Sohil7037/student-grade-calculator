import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int total = 0;

        // Input marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        // Calculate percentage
        double percentage = (double) total / numSubjects;

        // Grade logic
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output result
        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Program Ends");

        scanner.close();
    }
}