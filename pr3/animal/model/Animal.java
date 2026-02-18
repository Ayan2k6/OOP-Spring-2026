package pr3.animal.model;

public abstract class Animal {
    protected String name;
    protected int age;

    // Конструктор с параметрами [cite: 12]
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Абстрактный метод, так как у каждого животного свой звук
    public abstract void makeSound();

    // Метод eat() [cite: 12]
    public void eat() {
        System.out.println(name + " is eating generic food.");
    }

    // Перегруженный метод eat(String food) [cite: 13]
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    // Метод getInfo() [cite: 14]
    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}