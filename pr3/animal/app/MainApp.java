package pr3.animal.app;

import pr3.animal.model.Animal;
import pr3.animal.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Создаем список Animal [cite: 18]
        List<Animal> animals = new ArrayList<>();

        // Создаем объекты (полиморфизм: ссылка типа Animal, объект типа Dog) [cite: 17]
        Animal dog1 = new Dog("Rex", 3, "German Shepherd");
        Animal dog2 = new Dog("Bella", 5, "Labrador");
        Dog dog3 = new Dog("Max", 2, "Husky"); // Явное объявление Dog

        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);

        // Цикл для демонстрации полиморфизма [cite: 18]
        System.out.println("--- Animal Info & Sounds ---");
        for (Animal animal : animals) {
            // Вызов переопределенного getInfo
            System.out.println(animal.getInfo());
            // Вызов переопределенного makeSound (сработает версия Dog) [cite: 21]
            animal.makeSound();
            // Вызов перегруженных методов eat
            animal.eat();
            animal.eat("Meat");
            System.out.println("----------------");
        }
    }
}