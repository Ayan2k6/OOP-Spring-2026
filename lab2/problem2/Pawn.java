package lab2.problem2;

public class Pawn extends Piece {
    public Pawn(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.getRow() == b.getRow() && a.getCol() == b.getCol())) return false;
        
        int direction = isWhite ? 1 : -1;
        int startRow = isWhite ? 2 : 7;
        
        boolean isForwardOne = (b.getRow() - a.getRow() == direction) && (a.getCol() == b.getCol());
        boolean isFirstMoveTwo = (a.getRow() == startRow) && (b.getRow() - a.getRow() == 2 * direction) && (a.getCol() == b.getCol());
        
        return isForwardOne || isFirstMoveTwo;
    }

    @Override
    public char getSymbol() {
        return isWhite ? 'P' : 'p';
    }
}