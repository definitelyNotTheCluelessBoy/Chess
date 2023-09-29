package chess.chessBoard.ChessBoardPieces;

import chess.chessBoard.Tile;

import java.util.ArrayList;

public class Queen extends ChessBoardPiece {
    public Queen(int X, int Y) {
        super(X, Y);
    }

    @Override
    public ArrayList<Tile> fieldsInReach(Tile[][] tiles) {
        ArrayList<Tile> reachableTiles = new ArrayList<>();
        for (int i = super.getYCoordinates()-1; i <= super.getYCoordinates()+1; i++) {
            for (int j = super.getXCoordinates()-1; j <= super.getXCoordinates()+1; j++) {
                try {
                    if (i != super.getXCoordinates() && j != super.getYCoordinates())
                        reachableTiles.add(tiles[j][i]);
                } catch (Exception ignored) {
                }
            }
        }
        return reachableTiles;
    }
}
