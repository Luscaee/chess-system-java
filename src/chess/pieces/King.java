package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getCols()];
        Position p = new Position(0, 0);

        int[][] directions = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

        for (int[] dir : directions) {
            p.setValues(position.getRow() + dir[0], position.getCol() + dir[1]);

            if (getBoard().positionExists(p) && canMove(p)) {
                mat[p.getRow()][p.getCol()] = true;
            }
        }
        return mat;
    }

    @Override
    public String toString() {
        // return this.getColor() == Color.BLACK ? "♔" : "♚";
        return "K";
    }
}
