package boardgame;

public class Position {

    private int col;
    private int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setValues(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return row  + ", " + col;
    }
}
