import java.util.ArrayList;
import java.util.Scanner;

public class BarChartExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        System.out.println("--- Student Grade Bar Chart Generator ---");
        System.out.println("Enter student grades (0-100). Type 'done' when finished.\n");
        
        // 1. Record Sudent Grades
        while (true) {
            System.out.print("Enter a student's grade (or 'done'): ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            
            try {
                double grade = Double.parseDouble(input);
                if (grade >= 0 && grade <= 100) {
                    grades.add(grade);
                } else {
                    System.out.println("❌ Please enter a valid grade between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a number or 'done'.");
            }
        }
        
        // 2. Show Bar Chart
        if (grades.isEmpty()) {
            System.out.println("\nNo grades were entered.");
        } else {
            System.out.println("\n================ BAR CHART ================");
            for (int i = 0; i < grades.size(); i++) {
                double grade = grades.get(i);
                
                // Calculate asterisks: 1 for every 4th increment
                // e.g., (int)(75 / 4) = 18
                int asterisksCount = (int) (grade / 4);
                
                // Build the asterisks string
                String asterisks = "*".repeat(asterisksCount);
                
                // Print formatted output (Student number, grade, and bar)
                System.out.printf("Student %02d (%5.1f%%): %s%n", (i + 1), grade, asterisks);
            }
            System.out.println("===========================================");
        }
        
        scanner.close();
    }
}