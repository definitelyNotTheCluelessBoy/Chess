package chess.chessBoard.ChessBoardPieces;

import chess.chessBoard.Tile;

import java.util.ArrayList;

public class Bishop extends ChessBoardPiece{
    public Bishop(int X, int Y) {
        super(X, Y);
    }

    @Override
    public ArrayList<Tile> fieldsInReach(Tile[][] tiles) {
        ArrayList<Tile> reachableTiles = new ArrayList<>();


        int x = super.getXCoordinates();
        int y = super.getYCoordinates();
        while (x + 1 < 8 & y - 1 >= 0) {
            x++;
            y--;
            if (!(x == super.getXCoordinates() && y == super.getYCoordinates()))
                reachableTiles.add(tiles[x][y]);
        }

        x = super.getXCoordinates();
        y = super.getYCoordinates();
        while (x >= 0 & y < 8) {
            x--;
            y++;
            if (!(x == super.getXCoordinates() && y == super.getYCoordinates()))
                reachableTiles.add(tiles[x][y]);
        }

        x = super.getXCoordinates();
        y = super.getYCoordinates();
        while (x - 1 >= 0 & y - 1 >= 0) {
            x--;
            y--;
            if (!(x == super.getXCoordinates() && y == super.getYCoordinates()))
                reachableTiles.add(tiles[x][y]);
        }

        x = super.getXCoordinates();
        y = super.getYCoordinates();
        while (x < 8 & y < 8) {
            x++;
            y++;
            if (!(x == super.getXCoordinates() && y == super.getYCoordinates()))
                reachableTiles.add(tiles[x][y]);
        }


        return reachableTiles;
    }
}
