package lab2.problem2;

public class Board {
    private Piece[][] grid;

    public Board() {
        grid = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        placePiece(new Rook(new Position(1, 1), true)); 
        placePiece(new King(new Position(1, 5), true)); 
        placePiece(new Pawn(new Position(2, 5), true)); 
        
        placePiece(new King(new Position(8, 5), false)); 
    }

    public void placePiece(Piece piece) {
        Position pos = piece.getPosition();
        grid[pos.getRow() - 1][pos.getCol() - 1] = piece;
    }

    public Piece getPieceAt(Position pos) {
        return grid[pos.getRow() - 1][pos.getCol() - 1];
    }

    public boolean movePiece(Position start, Position end) {
        Piece piece = getPieceAt(start);
        
        if (piece == null) {
            System.out.println("На начальной позиции нет фигуры!");
            return false;
        }

        if (!piece.isLegalMove(end)) {
            System.out.println("Нелегальный ход для этой фигуры!");
            return false;
        }

        grid[end.getRow() - 1][end.getCol() - 1] = piece;
        grid[start.getRow() - 1][start.getCol() - 1] = null;
            
        piece.setPosition(end);
        
        return true;
    }

    public void drawBoard() {
        System.out.println("  1 2 3 4 5 6 7 8");
        System.out.println("  ----------------");
        for (int i = 7; i >= 0; i--) { 
            System.out.print((i + 1) + "|");
            for (int j = 0; j < 8; j++) {
                if (grid[i][j] == null) {
                    System.out.print(". "); 
                } else {
                    System.out.print(grid[i][j].getSymbol() + " ");
                }
            }
            System.out.println("|" + (i + 1));
        }
        System.out.println("  ----------------");
        System.out.println("  1 2 3 4 5 6 7 8");
    }
}