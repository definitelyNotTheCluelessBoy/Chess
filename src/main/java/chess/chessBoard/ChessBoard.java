package chess.chessBoard;

import chess.chessBoard.ChessBoardPieces.King;
import chess.chessBoard.ChessBoardPieces.Rook;

import java.util.ArrayList;

public class ChessBoard {

    private static ChessBoard chessBoard = null;
    Tile[][] tiles;

    private ChessBoard(){
        this.tiles = new Tile[8][8];
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                this.tiles[j][i] = new Tile(j,i);
            }
        }
        this.tiles[1][1].setPieceOnTile(new Rook(1,1));
        for (Tile tile : tiles[1][1].getPieceOnTile().fieldsInReach(this.tiles)) {
            System.out.println(tile.getxCoordinates() + " " + tile.getyCoordinates() + ", ");
        };

    }

    public static synchronized ChessBoard getChessBoard() {
        if (chessBoard == null)
            chessBoard = new ChessBoard();
        return chessBoard;
    }

    public Tile[][] getTiles() {
        return tiles;
    }
}
