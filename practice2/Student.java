package practice2;

public class Student {
    
    private String name;
    private int id;
    private int yearOfStudy;
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void incrementYearOfStudy() {
        this.yearOfStudy++;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Year of Study: " + yearOfStudy);
    }
    
    public static void main(String[] args) {
        Student stud = new Student("Ayan", 1);
        
        stud.displayDetails();

        System.out.println("--- A year has passed ---");
        stud.incrementYearOfStudy();
        
        stud.displayDetails();      
    }
}