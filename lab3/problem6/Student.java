package lab3.problem6;

import lab2.problem5.Person;

public class Student extends Person implements Comparable<Student>, Cloneable, Eatable {
    
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String getOccupation() {
        return "Student";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating at the university canteen.");
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}