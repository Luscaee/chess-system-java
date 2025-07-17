package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {
    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getCols()];
        Position p = new Position(0, 0);

        int[][] directions = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

        for (int[] dir : directions) {
            p.setValues(position.getRow() + dir[0], position.getCol() + dir[1]);

            while (getBoard().positionExists(p) && canMove(p)) {
                mat[p.getRow()][p.getCol()] = true;

                if (getBoard().thereIsAPiece(p)) break;

                p.setValues(p.getRow() + dir[0], p.getCol() + dir[1]);
            }
        }
        return mat;
    }

    @Override
    public String toString() {
        return "Q";
    }
}