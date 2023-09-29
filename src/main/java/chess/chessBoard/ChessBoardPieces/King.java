package chess.chessBoard.ChessBoardPieces;

import chess.chessBoard.Tile;

import java.util.ArrayList;

public class King extends ChessBoardPiece{
    public King(int X, int Y) {
        super(X, Y);
    }

    @Override
    public ArrayList<Tile> fieldsInReach(Tile[][] tiles) {
        ArrayList<Tile> reachableTiles = new ArrayList<>();
        for (int i = super.getYCoordinates()-1; i <= super.getYCoordinates()+1; i++) {
            for (int j = super.getXCoordinates()-1; j <= super.getXCoordinates()+1; j++) {
                if ((i>=0 && i<=7) && (j>=0 && j<=7)) {
                    if (!(j == super.getXCoordinates() && i == super.getYCoordinates()))
                        reachableTiles.add(tiles[j][i]);
                }
            }
        }
        return reachableTiles;
    }
}
