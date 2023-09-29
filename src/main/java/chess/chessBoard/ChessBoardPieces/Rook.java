package chess.chessBoard.ChessBoardPieces;

import chess.chessBoard.Tile;

import java.util.ArrayList;

public class Rook extends ChessBoardPiece {
    public Rook(int X, int Y) {
        super(X, Y);
    }

    @Override
    public ArrayList<Tile> fieldsInReach(Tile[][] tiles) {
        ArrayList<Tile> reachableTiles = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            if (!(i == super.getXCoordinates() && i == super.getYCoordinates())){
                reachableTiles.add(tiles[i][super.getXCoordinates()]);
                reachableTiles.add(tiles[super.getYCoordinates()][i]);
            }
        }
        return reachableTiles;
    }
}
