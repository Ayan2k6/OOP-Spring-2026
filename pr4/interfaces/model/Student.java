package pr4.interfaces.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable, Comparable<Student> {
    private String name;
    private double gpa;

    // Пустой конструктор (нужен для кода из Problem 2)
    public Student() {
        this.name = "Unknown";
        this.gpa = 0.0;
    }

    // Конструктор для Problem 4
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void eatPizza() {
        System.out.println("Student " + name + ": eat Pizza");
    }

    @Override
    public void retakeExam() {
        System.out.println("Student " + name + ": retakeExam");
    }

    @Override
    public void move() {
        System.out.println("Student " + name + ": move");
    }

    // Сортировка по умолчанию: по GPA (по возрастанию)
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + "}";
    }
}