package chess.chessBoard;

import chess.chessBoard.ChessBoardPieces.ChessBoardPiece;

public class Tile {
    private ChessBoardPiece pieceOnTile;
    private final int xCoordinates;
    private final int yCoordinates;

    public Tile(int xCoordinates, int yCoordinates) {
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
        this.pieceOnTile = null;
    }

    public int getxCoordinates() {
        return xCoordinates;
    }

    public int getyCoordinates() {
        return yCoordinates;
    }

    public boolean isOccupied() {
        return pieceOnTile != null;
    }

    public void setPieceOnTile(ChessBoardPiece pieceOnTile) {
        this.pieceOnTile = pieceOnTile;
    }

    public ChessBoardPiece deletePieceFromTile() {
        ChessBoardPiece temp = this.pieceOnTile;
        this.pieceOnTile = null;
        return temp;
    }

    public ChessBoardPiece getPieceOnTile() {
        return pieceOnTile;
    }
}
