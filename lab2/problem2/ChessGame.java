package lab2.problem2;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        boolean isGameOver = false;

        System.out.println("Добро пожаловать в Шахматы!");
        
        while (!isGameOver) {
            board.drawBoard(); 
            
            System.out.println("Введите ход в формате 'Строка_От Колонна_От Строка_До Колонна_До' (например: 2 5 3 5):");
            System.out.print("> ");
            
            int startRow = scanner.nextInt();
            int startCol = scanner.nextInt();
            int endRow = scanner.nextInt();
            int endCol = scanner.nextInt();

            Position startPos = new Position(startRow, startCol);
            Position endPos = new Position(endRow, endCol);

            if (startPos.isValid() && endPos.isValid()) {
                boolean success = board.movePiece(startPos, endPos);
                if (success) {
                    System.out.println("Ход выполнен успешно.");
                }
            } else {
                System.out.println("Ошибка: Координаты должны быть от 1 до 8.");
            }
        }
        scanner.close();
    }
}