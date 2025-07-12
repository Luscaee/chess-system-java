package application;

import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

    public static ChessPosition readChessPosition(Scanner sc) {
        try {
            String s = sc.nextLine();
            char col = s.charAt(0);
            int row = Integer.parseInt(s.substring(1));
            return new ChessPosition(col, row);
        } catch (RuntimeException r) {
            throw new InputMismatchException("Error reading ChessPosition. Valid values are from a1 to h8.");
        }
    }

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces[i].length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  Ａ Ｂ Ｃ Ｄ Ｅ Ｆ Ｇ Ｈ");
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("－");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
