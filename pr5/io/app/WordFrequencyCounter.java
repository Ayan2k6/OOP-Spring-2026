package pr5.io.app; // problem2

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\user\\Desktop\\CODES\\OOP-Spring-2026\\pr5\\input.txt"), StandardCharsets.UTF_8));
             PrintWriter writer = new PrintWriter("C:\\Users\\user\\Desktop\\CODES\\OOP-Spring-2026\\pr5\\report.txt", StandardCharsets.UTF_8.name())) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("[\\p{Punct}\\s]+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCount.entrySet());
            
            sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

            for (Map.Entry<String, Integer> entry : sortedEntries) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("Готово! Частотный анализ завершен. Проверьте файл report.txt.");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлами: " + e.getMessage());
        }
    }
}
