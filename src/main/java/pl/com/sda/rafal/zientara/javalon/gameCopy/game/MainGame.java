package pl.com.sda.rafal.zientara.javalon.gameCopy.game;

import pl.com.sda.rafal.zientara.javalon.gameCopy.game.players.AbstractPlayer;
import pl.com.sda.rafal.zientara.javalon.gameCopy.game.players.RandomPlayer;
import pl.com.sda.rafal.zientara.javalon.gameCopy.game.players.ScannerPlayer;
import pl.com.sda.rafal.zientara.javalon.gameCopy.game.players.StonedPlayer;

public class MainGame {

    public static void main(String[] args) {
        /*AbstractPlayer player1 = new AbstractPlayer() {
            public GameAction chooseAction() {
                return GameAction.SCISSORS;
            }
        };*/
        AbstractPlayer player1 = new ScannerPlayer("Zdzichu");
        AbstractPlayer player2 = new StonedPlayer("Zosia");
        Game game = new Game(player1, player2);
        game.startGame();
    }
}
