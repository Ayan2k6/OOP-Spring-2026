package lab2.problem2;

public class Queen extends Piece {
    public Queen(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.getRow() == b.getRow() && a.getCol() == b.getCol())) return false;
        boolean isStraight = a.getRow() == b.getRow() || a.getCol() == b.getCol();
        boolean isDiagonal = Math.abs(a.getRow() - b.getRow()) == Math.abs(a.getCol() - b.getCol());
        return isStraight || isDiagonal;
    }

    @Override
    public char getSymbol() {
        return isWhite ? 'Q' : 'q';
    }
}