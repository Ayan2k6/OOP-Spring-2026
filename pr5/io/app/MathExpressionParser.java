package pr5.io.app; // problem5

import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class MathExpressionParser {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\user\\Desktop\\CODES\\OOP-Spring-2026\\pr5\\expressions.txt"; 
        String resultsFile = "C:\\Users\\user\\Desktop\\CODES\\OOP-Spring-2026\\pr5\\results.txt"; // Сюда пойдут правильные ответы
        String logFile = "C:\\Users\\user\\Desktop\\CODES\\OOP-Spring-2026\\pr5\\log.txt";         // Сюда пойдут ошибки

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter resultsWriter = new PrintWriter(new FileWriter(resultsFile));
             PrintWriter logWriter = new PrintWriter(new FileWriter(logFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                try {
                    StringTokenizer st = new StringTokenizer(line, "+-*/%^", true);
                    
                    // 1. Получаем первое число (операнд)
                    String token1 = st.nextToken();
                    double num1 = Double.parseDouble(token1.trim()); 

                    // 2. Получаем знак операции (оператор)
                    if (!st.hasMoreTokens()) {
                        throw new NoSuchElementException("Отсутствует оператор");
                    }
                    String operator = st.nextToken().trim();
                    
                    if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                        throw new UnsupportedOperationException("Неподдерживаемый оператор: " + operator);
                    }

                    // 3. Получаем второе число
                    String token2 = st.nextToken();
                    double num2 = Double.parseDouble(token2.trim());

                    double result = 0;
                    switch (operator) {
                        case "+": result = num1 + num2; break;
                        case "-": result = num1 - num2; break;
                        case "*": result = num1 * num2; break;
                        case "/": 
                            if (num2 == 0) throw new ArithmeticException("Деление на ноль");
                            result = num1 / num2; 
                            break;
                    }

                    // Успешный результат пишем в results.txt 
                    resultsWriter.println(line + " = " + result);

                } catch (NoSuchElementException e) {
                    // Ошибка 1: Нет операнда 
                    logWriter.println("Ошибка в выражении '" + line + "': Не хватает операнда (NoSuchElementException)");
                } catch (NumberFormatException e) {
                    // Ошибка 2: Буква вместо числа 
                    logWriter.println("Ошибка в выражении '" + line + "': Неверный формат числа (NumberFormatException)");
                } catch (UnsupportedOperationException e) {
                    // Ошибка 3: Неверный знак 
                    logWriter.println("Ошибка в выражении '" + line + "': " + e.getMessage() + " (UnsupportedOperationException)");
                } catch (Exception e) {
                    // На всякий случай ловим другие ошибки (например, деление на ноль)
                    logWriter.println("Ошибка в выражении '" + line + "': " + e.getMessage());
                }
            }
            
            System.out.println("Парсинг завершен! Проверьте файлы results.txt и log.txt.");

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
            System.out.println("Убедитесь, что вы создали файл " + inputFile + " рядом с input.txt");
        }
    }
}