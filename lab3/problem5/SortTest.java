package lab3.problem5;

import practice2.Time;

public class SortTest {
    public static void main(String[] args) {
        // Тест с шоколадками
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50.5),
            new Chocolate("Snickers", 45.0),
            new Chocolate("Mars", 60.2)
        };
        Sort.bubbleSort(chocolates);
        System.out.println("Sorted Chocolates: ");
        for (Chocolate c : chocolates) System.out.println(c);

        System.out.println("---");

        // Тест с твоим классом Time
        Time[] times = {
            new Time(14, 30, 0),
            new Time(9, 15, 0),
            new Time(14, 25, 0)
        };
        Sort.mergeSort(times);
        System.out.println("Sorted Times: ");
        for (Time t : times) System.out.println(t.toUniversal());
    }
}