package lab2.problem2;

public class King extends Piece {
    public King(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.getRow() == b.getRow() && a.getCol() == b.getCol())) return false;
        return Math.abs(a.getRow() - b.getRow()) <= 1 && Math.abs(a.getCol() - b.getCol()) <= 1;
    }

    @Override
    public char getSymbol() {
        return isWhite ? 'K' : 'k';
    }
}