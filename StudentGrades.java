import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        // Inputting grades
        System.out.println("Enter student grades (enter -1 to stop):");
        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            if (grade == -1) {  // Stop input when -1 is entered
                break;
            }
            if (grade >= 0 && grade <= 100) {  // Check for valid grade
                grades.add(grade);
            } else {
                System.out.println("Please enter a valid grade (0-100).");
            }
        }

        // Checking if any grades were entered
        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            // Calculating average, highest, and lowest scores
            int sum = 0;
            int highest = grades.get(0);
            int lowest = grades.get(0);

            for (int grade : grades) {
                sum += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = sum / (double) grades.size();

            // Displaying the results
            System.out.println("\nResults:");
            System.out.printf("Average grade: %.2f\n", average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        }

        scanner.close();
    }
}
