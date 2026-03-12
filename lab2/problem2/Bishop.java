package lab2.problem2;

public class Bishop extends Piece {
    public Bishop(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.getRow() == b.getRow() && a.getCol() == b.getCol())) return false;
        return Math.abs(a.getRow() - b.getRow()) == Math.abs(a.getCol() - b.getCol());
    }

    @Override
    public char getSymbol() {
        return isWhite ? 'B' : 'b';
    }
}