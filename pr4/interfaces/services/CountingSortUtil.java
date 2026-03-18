package pr4.interfaces.services;

public class CountingSortUtil {
    
    public static void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        
        // Диапазон значений по условию задачи: от 0 до 10
        int max = 10;
        int[] count = new int[max + 1];
        
        // Считаем частоту появления каждого элемента
        for (int num : arr) {
            count[num]++;
        }
        
        // Перестраиваем исходный массив на основе частот
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}