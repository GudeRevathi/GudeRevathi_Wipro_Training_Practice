import java.util.Scanner;

// Custom Exception
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine(); // consume newline

            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter name of student " + (i + 1) + ": ");
                String name = scanner.nextLine();

                System.out.print("Enter grade for " + name + " (0-100): ");
                int grade = scanner.nextInt();
                scanner.nextLine(); // consume newline

                // Validate grade
                if (grade < 0 || grade > 100) {
                    throw new InvalidGradeException("Grade must be between 0 and 100. Invalid input: " + grade);
                }

                System.out.println(name + "'s grade: " + grade);
            }
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Grade entry process completed.");
            scanner.close();
        }
    }
}
