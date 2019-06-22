package pl.com.sda.rafal.zientara.javalon.week2.homework.ticTacToe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        printHelp();
        game.printBoard();
        while (game.getResult() == GameResult.PENDING) {
            if (game.isPlayerXTurn()) {
                System.out.println("Player X action:");
            } else {
                System.out.println("Player O action:");
            }
            makeMove(game);
            game.printBoard();
        }
        switch (game.getResult()) {
            case PLAYER_O_WIN:
                System.out.println("O Wins!");
                break;
            case PLAYER_X_WIN:
                System.out.println("X Wins!");
                break;
            case DRAW:
                System.out.println("Tie!");
                break;
        }
    }

    private static void printHelp() {
        System.out.println("Podaj liczbe 1-9");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
    }

    public static void makeMove(TicTacToe game) {
        Scanner scanner = new Scanner(System.in);
        //todo pobierz liczbe 1-9 i wykonaj ruch

        int value;
        try {
            value = scanner.nextInt();
            makeMoveBasedOnValue(game, value);
        } catch (FieldOcuppiedException e) {
            System.out.println("To pole jest zajête!");
        } catch (Exception e) {
            System.out.println("Z³a wartoœc! Podaj od 1 do 9");
        }
    }

    private static void makeMoveBasedOnValue(TicTacToe game, int value) {
        switch (value) {
            case 1:
                game.addMark(0, 0);
                break;
            case 2:
                game.addMark(0, 1);
                break;
            case 3:
                game.addMark(0, 2);
                break;
            case 4:
                game.addMark(1, 0);
                break;
            case 5:
                game.addMark(1, 1);
                break;
            case 6:
                game.addMark(1, 2);
                break;
            case 7:
                game.addMark(2, 0);
                break;
            case 8:
                game.addMark(2, 1);
                break;
            case 9:
                game.addMark(2, 2);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
