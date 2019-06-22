package pl.com.sda.rafal.zientara.javalon.week2.homework.ticTacToe;

public class TicTacToe {
    public final static int FIELD_EMPTY = 0;
    public final static int FIELD_X = 1;
    public final static int FIELD_O = 2;

    private int[][] field = new int[3][3];
    private boolean playerXTurn = true;

    public int getFieldStatus(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2)
            throw new IllegalArgumentException("Out of field");
        return field[row][col];
    }

    public boolean isPlayerXTurn() {
        return playerXTurn;
    }

    public boolean isPlayerOTurn() {
        return !playerXTurn;
    }

    public void addMark(int row, int col) {
        if (isPlayerXTurn()) {
            field[row][col] = TicTacToe.FIELD_X;
        } else {
            field[row][col] = TicTacToe.FIELD_O;
        }

        //inaczej
//        field[row][col] = playerXTurn ? TicTacToe.FIELD_X : TicTacToe.FIELD_O;

        playerXTurn = !playerXTurn;

    }

}
