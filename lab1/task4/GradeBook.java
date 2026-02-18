package lab1.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import practice2.Student;

public class GradeBook {
    private Course course;
    private List<Student> students; // List of Students [cite: 56]
    private Map<Student, Integer> grades; // Storing grades design decision 

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    // Добавляем студента в список
    public void addStudent(Student s) {
        students.add(s);
    }

    // Метод для установки оценки
    public void setGrade(Student s, int grade) {
        grades.put(s, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!"); // [cite: 59, 71]
    }

    public void displayGradeReport() { // [cite: 60]
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }

        System.out.printf("Class average is %.2f. ", determineClassAverage());

        // Поиск мин/макс
        Student minS = null, maxS = null;
        int minG = 101, maxG = -1;

        for (Student s : students) {
            if (grades.containsKey(s)) {
                int g = grades.get(s);
                if (g < minG) { minG = g; minS = s; }
                if (g > maxG) { maxG = g; maxS = s; }
            }
        }
        
        // Форматируем вывод вручную, так как у Student нет toString() [cite: 83]
        if (minS != null)
            System.out.println("Lowest grade is " + minG + " (" + minS.getName() + ", id: " + minS.getId() + ").");
        if (maxS != null)
            System.out.println("Highest grade is " + maxG + " (" + maxS.getName() + ", id: " + maxS.getId() + ").");

        outputBarChart();
    }

    public double determineClassAverage() { // [cite: 61]
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (int g : grades.values()) {
            sum += g;
        }
        return sum / grades.size();
    }

    public void outputBarChart() { // [cite: 61]
        System.out.println("Grades distribution:");
        int[] frequency = new int[11];

        for (int g : grades.values()) {
            if (g == 100) frequency[10]++;
            else frequency[g / 10]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int k = 0; k < frequency[i]; k++) System.out.print("*");
            System.out.println();
        }
    }
    
    @Override
    public String toString() { // [cite: 68]
        return "GradeBook for " + course.getName();
    }
}