package lab1.task4;

import java.util.Scanner;
import practice2.Student;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Create Course [cite: 65]
        Course course = new Course("CS101", "OOP & Design", 5, "None");
        
        // 2. Create GradeBook
        GradeBook book = new GradeBook(course);
        book.displayMessage();
        
        // 3. Create Students and add to book
        Student[] students = {
            new Student("Student A", 1),
            new Student("Student B", 2),
            new Student("Student C", 3),
            new Student("Student D", 4),
            new Student("Student E", 5)
        };

        for (Student s : students) {
            book.addStudent(s);
        }

        // 4. Input grades [cite: 65]
        System.out.println("Please, input grades for students:");
        
        for (Student s : students) {
            System.out.print(s.getName() + ": "); // [cite: 72]
            int grade = scanner.nextInt();
            book.setGrade(s, grade);
        }
        
        // 5. Report
        book.displayGradeReport();
    }
}