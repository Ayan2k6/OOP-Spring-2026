package lab1.task1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.next(); // [cite: 20, 21]

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            // Обработка некоректного ввода [cite: 30]
            try {
                double val = Double.parseDouble(input);
                data.addValue(val);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number or 'Q'.");
            }
        }

        // Output results [cite: 27, 28]
        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getLargest());
        
        scanner.close();
    }
}