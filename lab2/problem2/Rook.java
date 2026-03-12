package lab2.problem2;

public class Rook extends Piece {
    public Rook(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.getRow() == b.getRow() && a.getCol() == b.getCol())) return false;
        return a.getRow() == b.getRow() || a.getCol() == b.getCol();
    }

    @Override
    public char getSymbol() {
        return isWhite ? 'R' : 'r';
    }
}