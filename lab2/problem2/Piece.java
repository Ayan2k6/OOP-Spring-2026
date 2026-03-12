package lab2.problem2;

public abstract class Piece {
    protected Position a;
    protected boolean isWhite; // В шахматах важен цвет

    public Piece(Position a, boolean isWhite) {
        this.a = a;
        this.isWhite = isWhite;
    }

    public abstract boolean isLegalMove(Position b);
    public abstract char getSymbol();
    
    public boolean isWhite() { return isWhite; }
    public Position getPosition() { return a; }
    public void setPosition(Position a) { this.a = a; }
}