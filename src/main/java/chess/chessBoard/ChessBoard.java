package chess.chessBoard;

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
            System.out.println();
        }
    }

    public static synchronized ChessBoard getChessBoard() {
        if (chessBoard == null)
            chessBoard = new ChessBoard();
        return chessBoard;
    }


}
