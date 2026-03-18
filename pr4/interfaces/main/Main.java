package pr4.interfaces.main;

import pr4.interfaces.model.*;
import pr4.interfaces.services.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PROBLEM 4 =====");
        
        // 3. Создаем список студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Zarina", 3.2));
        students.add(new Student("Arman", 3.8));
        students.add(new Student("Daniyar", 2.9));
        students.add(new Student("Aruzhan", 4.0));

        System.out.println("--- Оригинальный список ---");
        for (Student s : students) System.out.println(s);

        // 1. Демонстрация сортировки по умолчанию (по GPA)
        Collections.sort(students);
        System.out.println("\n--- Отсортировано по GPA (Comparable) ---");
        for (Student s : students) System.out.println(s);

        // 2. Демонстрация сортировки по имени (NameComparator)
        Collections.sort(students, new NameComparator());
        System.out.println("\n--- Отсортировано по Имени (Comparator) ---");
        for (Student s : students) System.out.println(s);


        System.out.println("\n===== BONUS TASK: Counting Sort =====");
        
        // Массив чисел в диапазоне от 0 до 10
        int[] numbers = {4, 2, 10, 0, 4, 1, 2, 8, 9, 2, 5};
        System.out.println("Оригинальный массив: " + Arrays.toString(numbers));
        
        // Сортируем
        CountingSortUtil.countingSort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}