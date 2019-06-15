package pl.com.sda.rafal.zientara.javalon.game;

import pl.com.sda.rafal.zientara.javalon.game.players.Player;
import pl.com.sda.rafal.zientara.javalon.game.players.RandomPlayer;
import pl.com.sda.rafal.zientara.javalon.game.players.ScannerPlayer;

public class MainGame {

    public static void main(String[] args) {
        /*Player player1 = new Player() {
            public GameAction chooseAction() {
                return GameAction.SCISSORS;
            }
        };*/
        Player player1 = new ScannerPlayer();
        Player player2 = new RandomPlayer();
        Game game = new Game(player1, player2);
        game.startGame();
    }
}
