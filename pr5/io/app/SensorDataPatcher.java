package pr5.io.app; // problem4

import java.io.*;
import java.util.Random;

public class SensorDataPatcher {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\user\\Desktop\\CODES\\OOP-Spring-2026\\pr5\\sensor.bin";
        int totalRecords = 60;

        // Шаг 1: Симуляция датчика. Записываем 60 значений (от 15.0 до 35.0) с помощью DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            Random random = new Random();
            for (int i = 0; i < totalRecords; i++) {
                double temp = 15.0 + (35.0 - 15.0) * random.nextDouble();
                dos.writeDouble(temp);
            }
            System.out.println("Шаг 1: Успешно записано 60 значений температуры в " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }

        // Шаг 2: "Патчинг" данных. Находим 30-ю запись и меняем её на 999.9 с помощью RandomAccessFile
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            int targetIndex = 29; 
            long position = (long) targetIndex * 8; 
            
            raf.seek(position);
            raf.writeDouble(999.9);
            System.out.println("Шаг 2: 30-я запись успешно заменена на аномальное значение 999.9");
        } catch (IOException e) {
            System.out.println("Ошибка при изменении файла: " + e.getMessage());
        }

        // Шаг 3: Чтение данных. Считаем среднее и максимальное значение с помощью DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            double sum = 0;
            double maxTemp = Double.MIN_VALUE;
            int count = 0;

            while (dis.available() > 0) {
                double temp = dis.readDouble();
                sum += temp;
                if (temp > maxTemp) {
                    maxTemp = temp;
                }
                count++;
            }

            double average = sum / count;

            System.out.println("\nШаг 3: Чтение данных завершено.");
            System.out.println("Всего прочитано записей: " + count);
            System.out.printf("Максимальная температура (должен быть наш 'скачок'): %.2f\n", maxTemp);
            System.out.printf("Средняя температура: %.2f\n", average);

        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
    }
}
