package Application;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

import java.util.Scanner;

public class Pogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        while(true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(input);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(input);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }

    }
}
