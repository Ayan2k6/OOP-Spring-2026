package pr4.interfaces.main;

import pr4.interfaces.model.*;
import pr4.interfaces.services.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // PROBLEM 2: Ресторан, Кот и Студент
        
        System.out.println("===== PROBLEM 2 =====");
        Restaurant restaurant = new Restaurant();
        Cat cat = new Cat();
        // Используем пустой конструктор для простого студента
        Student basicStudent = new Student(); 

        System.out.println("--- Serving Cat ---");
        restaurant.servePizza(cat);

        System.out.println("\n--- Serving Student ---");
        restaurant.servePizza(basicStudent);


        // PROBLEM 3: Игры и iPhone

        System.out.println("\n===== PROBLEM 3 =====");
        App app = new App();
        Game logicGame = new LogicGame();
        Game memoryGame = new MemoryGame();
        
        app.getStatistics(logicGame);
        app.getStatistics(memoryGame);

        System.out.println("\n--- Sellable & Pluggable ---");
        iPhone myPhone = new iPhone();
        myPhone.sell();
        myPhone.plugIn();


        // PROBLEM 4: Сортировка Студентов

        System.out.println("\n===== PROBLEM 4 =====");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Zarina", 3.2));
        students.add(new Student("Arman", 3.8));
        students.add(new Student("Daniyar", 2.9));
        students.add(new Student("Aruzhan", 4.0));

        System.out.println("--- Оригинальный список ---");
        for (Student s : students) System.out.println(s);

        Collections.sort(students);
        System.out.println("\n--- Отсортировано по GPA (Comparable) ---");
        for (Student s : students) System.out.println(s);

        Collections.sort(students, new NameComparator());
        System.out.println("\n--- Отсортировано по Имени (Comparator) ---");
        for (Student s : students) System.out.println(s);


        // BONUS TASK: Сортировка подсчетом

        System.out.println("\n===== BONUS TASK: Counting Sort =====");
        int[] numbers = {4, 2, 10, 0, 4, 1, 2, 8, 9, 2, 5};
        System.out.println("Оригинальный массив: " + Arrays.toString(numbers));
        
        CountingSortUtil.countingSort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}