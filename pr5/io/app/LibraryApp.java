package pr5.io.app; // problem3

import pr5.io.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    private static final String FILE_NAME = "C:\\Users\\user\\Desktop\\CODES\\OOP-Spring-2026\\pr5\\library.dat";

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        
        // 1. Загрузка данных при запуске приложения
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                library = (ArrayList<Book>) ois.readObject();
                System.out.println("Библиотека успешно загружена из файла " + FILE_NAME);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Ошибка при загрузке библиотеки: " + e.getMessage());
            }
        } else {
            System.out.println("Файл библиотеки не найден. Будет создана новая пустая библиотека.");
        }

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        // 2. Главное меню
        while (isRunning) {
            System.out.println("\n--- Меню Библиотеки ---");
            System.out.println("(A)dd - Добавить книгу");
            System.out.println("(L)ist - Показать все книги");
            System.out.println("(Q)uit - Выйти и сохранить");
            System.out.print("Выберите действие: ");
            
            String choice = scanner.nextLine().trim().toUpperCase();

            switch (choice) {
                case "A":
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора: ");
                    String author = scanner.nextLine();
                    library.add(new Book(title, author));
                    System.out.println("Книга успешно добавлена!");
                    break;
                case "L":
                    if (library.isEmpty()) {
                        System.out.println("В библиотеке пока нет книг.");
                    } else {
                        System.out.println("\nСписок книг:");
                        for (Book book : library) {
                            book.incrementVisitCount(); 
                            System.out.println(book.toString());
                        }
                    }
                    break;
                case "Q":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверная команда. Пожалуйста, введите A, L или Q.");
            }
        }

        // 3. Сохранение данных при выходе
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(library);
            System.out.println("Данные успешно сохранены в " + FILE_NAME + ". До свидания!");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении библиотеки: " + e.getMessage());
        }
        
        scanner.close();
    }
}