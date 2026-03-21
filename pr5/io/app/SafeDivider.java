package pr5.io.app; // problem1 

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isSuccessful = false;

        while (!isSuccessful) {
            try {
                System.out.print("Введите первое целое число: ");
                int x1 = scan.nextInt(); 
                
                System.out.print("Введите второе целое число: ");
                int x2 = scan.nextInt();

                int result = x1 / x2;
                System.out.println("Результат деления: " + result);
                
                isSuccessful = true;

            } catch (ArithmeticException e) {
                System.out.println("Ошибка: Деление на ноль невозможно. Пожалуйста, попробуйте снова.\n");
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Вы ввели текст или некорректный символ вместо числа. Пожалуйста, попробуйте снова.\n");
                scan.nextLine();
            }
        }
        
        scan.close();
    }
}