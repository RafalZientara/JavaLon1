package pl.com.sda.rafal.zientara.javalon.game;

import pl.com.sda.rafal.zientara.javalon.game.players.Player;

public class Game {
    private final Player player1;
    private final Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        GameAction action1 = player1.chooseAction();
        GameAction action2 = player2.chooseAction();
        System.out.println(player1.getNick() + " action: " + action1);
        System.out.println(player2.getNick() + " action: " + action2);
        GameResult result = checkResult(action1, action2);
        printGameResult(result);
    }

    private void printGameResult(GameResult result) {
        switch (result) {
            case PLAYER_1_WIN:
                System.out.println(player1.getNick() + " WINS!");
                break;
            case PLAYER_2_WIN:
                System.out.println(player2.getNick() + " WINS!");
                break;
            case TIE:
                System.out.println("Tie!");
                break;
        }
    }

    private GameResult checkResult(GameAction action1, GameAction action2) {
        if (action1 == action2) {
            return GameResult.TIE;
        }
        if ((action1 == GameAction.ROCK && action2 == GameAction.SCISSORS) ||
                (action1 == GameAction.PAPER && action2 == GameAction.ROCK) ||
                (action1 == GameAction.SCISSORS && action2 == GameAction.PAPER)) {
            return GameResult.PLAYER_1_WIN;
        }
        return GameResult.PLAYER_2_WIN;
    }
}
