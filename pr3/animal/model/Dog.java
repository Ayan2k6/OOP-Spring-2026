package pr3.animal.model;

public class Dog extends Animal {
    private String breed;

    // Конструктор использует super(...) [cite: 15]
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Переопределение makeSound() [cite: 16]
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Переопределение getInfo() с вызовом super.getInfo() [cite: 16]
    @Override
    public String getInfo() {
        return super.getInfo() + ", Breed: " + breed;
    }
}
