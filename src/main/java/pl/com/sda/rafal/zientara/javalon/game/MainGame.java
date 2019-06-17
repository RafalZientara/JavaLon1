package pl.com.sda.rafal.zientara.javalon.game;

import pl.com.sda.rafal.zientara.javalon.game.players.*;

public class MainGame {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }


        SimplePlayer player = () -> GameAction.SCISSORS;
        SimplePlayer playerp = new SimplePlayer() {
            public GameAction chooseAction() {
                return GameAction.SCISSORS;
            }
        };

        DoSomething something = () -> System.out.println("Hello");
        DoSomething something2 = new DoSomething() {
            @Override
            public void doStuff() {
                System.out.println("Hello");
            }
        };

        DoSomething something3 = MainGame::printHello;


        LambdaWithParameters parameters2 = new LambdaWithParameters() {
            @Override
            public Integer sumElements(int a) {
                return a;
            }
        };
        Player player1 = new ScannerPlayer();
        Player player2 = new RandomPlayer();
        Game game = new Game(player1, player2);
        game.startGame();
    }

    private static void printHello() {
        System.out.println("Hello");
    }
}
