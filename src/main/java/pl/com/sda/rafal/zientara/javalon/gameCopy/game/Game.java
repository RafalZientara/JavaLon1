package pl.com.sda.rafal.zientara.javalon.gameCopy.game;


import pl.com.sda.rafal.zientara.javalon.gameCopy.game.players.AbstractPlayer;

public class Game {
    private final AbstractPlayer player1;
    private final AbstractPlayer player2;

    public Game(AbstractPlayer player1, AbstractPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        GameAction action1 = player1.chooseAction();
        GameAction action2 = player2.chooseAction();
        System.out.println(player1.getName() + " action: " + action1);
        System.out.println(player2.getName() + " action: " + action2);
        GameResult result = checkResult(action1, action2);
        printGameResult(result);
    }

    private void printGameResult(GameResult result) {
        switch (result) {
            case PLAYER_1_WIN:
                System.out.println(player1.getName() + " WINS!");
                break;
            case PLAYER_2_WIN:
                System.out.println(player2.getName() + " WINS!");
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
