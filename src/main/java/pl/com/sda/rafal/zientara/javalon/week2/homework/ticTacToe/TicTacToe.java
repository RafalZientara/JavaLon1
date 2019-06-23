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
        if (getResult() != GameResult.PENDING) {//todo napisz test
            throw new IllegalStateException("Game is finished!");
        }
        if (getFieldStatus(row, col) != TicTacToe.FIELD_EMPTY) {
            throw new FieldOcuppiedException();
        }

        if (isPlayerXTurn()) {
            field[row][col] = TicTacToe.FIELD_X;
        } else {
            field[row][col] = TicTacToe.FIELD_O;
        }

        //inaczej
//        field[row][col] = playerXTurn ? TicTacToe.FIELD_X : TicTacToe.FIELD_O;

        playerXTurn = !playerXTurn;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(fieldToString(i, j));
                if (j < 2)
                    System.out.print("|");
            }
            System.out.println();
            if (i < 2)
                System.out.println("---+---+---");
        }

        System.out.println();
    }

    private String fieldToString(int row, int col) {
        switch (getFieldStatus(row, col)) {
            default:
            case FIELD_EMPTY:
                return "   ";
            case FIELD_X:
                return " X ";
            case FIELD_O:
                return " O ";
        }
    }

    public GameResult getResult() {
        if (checkWantedMarkHorizontally(FIELD_X) ||
                checkWantedMarkVertically(FIELD_X) ||
                checkWantedMarkDiagonal(FIELD_X) ||
                checkWantedMarkDiagonalNegative(FIELD_X))
            return GameResult.PLAYER_X_WIN;
        if (checkWantedMarkHorizontally(FIELD_O) ||
                checkWantedMarkVertically(FIELD_O) ||
                checkWantedMarkDiagonal(FIELD_O) ||
                checkWantedMarkDiagonalNegative(FIELD_O))
            return GameResult.PLAYER_O_WIN;

        if (isBoardFull()) {
            return GameResult.DRAW;
        }

        return GameResult.PENDING;
    }

    private boolean isBoardFull() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] != TicTacToe.FIELD_EMPTY) {
                    count++;
                }
            }
        }
        return count == 9;
//        if (count == 9) {
//            return true;
//        } else {
//            return false;
//        }
    }

    private boolean checkWantedMarkHorizontally(int wantedMark) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == wantedMark &&
                    field[i][1] == wantedMark &&
                    field[i][2] == wantedMark) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWantedMarkVertically(int wantedMark) {
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == wantedMark &&
                    field[1][i] == wantedMark &&
                    field[2][i] == wantedMark) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWantedMarkDiagonal(int wantedMark) {
        if (field[0][2] == wantedMark &&
                field[1][1] == wantedMark &&
                field[2][0] == wantedMark) {
            return true;
        }
        return false;
    }

    private boolean checkWantedMarkDiagonalNegative(int wantedMark) {
        if (field[0][0] == wantedMark &&
                field[1][1] == wantedMark &&
                field[2][2] == wantedMark) {
            return true;
        }
        return false;
    }
}
