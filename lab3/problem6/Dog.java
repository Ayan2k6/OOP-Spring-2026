package lab3.problem6;

import lab2.problem5.Animal;

public class Dog extends Animal implements Comparable<Dog>, Cloneable, Soundable, Eatable {
    
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof";
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

    @Override
    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }
}