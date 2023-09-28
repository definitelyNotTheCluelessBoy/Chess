package chess.chessBoard;

public abstract class ChessBoardPiece {
    private int xCoordinates;
    private int yCoordinates;

    public ChessBoardPiece(int X, int Y) {
        this.xCoordinates = X;
        this.yCoordinates = Y;
    }

    public void move(int newCoordinatesX, int newCoordinatesY)
    {
        this.xCoordinates = newCoordinatesX;
        this.yCoordinates = newCoordinatesY;
    }

    public int getXCoordinates() {
        return xCoordinates;
    }

    public int getYCoordinates() {
        return yCoordinates;
    }

    public abstract void viableFields();
}
