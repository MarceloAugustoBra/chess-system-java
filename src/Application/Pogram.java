package Application;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessMatch;

public class Pogram {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
