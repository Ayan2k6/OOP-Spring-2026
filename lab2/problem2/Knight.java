package lab2.problem2;

public class Knight extends Piece {
    public Knight(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isValid() || (a.getRow() == b.getRow() && a.getCol() == b.getCol())) return false;
        int rowDiff = Math.abs(a.getRow() - b.getRow());
        int colDiff = Math.abs(a.getCol() - b.getCol());
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }

    @Override
    public char getSymbol() {
        return isWhite ? 'N' : 'n';
    }
}