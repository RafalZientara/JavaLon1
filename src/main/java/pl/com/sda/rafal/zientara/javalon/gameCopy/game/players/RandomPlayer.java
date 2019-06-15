package pl.com.sda.rafal.zientara.javalon.gameCopy.game.players;

import pl.com.sda.rafal.zientara.javalon.gameCopy.game.GameAction;

import java.util.Random;

public class RandomPlayer extends AbstractPlayer {

    private Random random = new Random();

    public RandomPlayer(String name) {
        super(name);
    }

    public GameAction chooseAction() {
        int output = random.nextInt(3);
        return getGameActionFromSwitch(output);
    }

    private GameAction getGameActionFromSwitch(int output) {
        switch (output) {
            case 0:
                return GameAction.ROCK;
            case 1:
                return GameAction.PAPER;
            default:
                return GameAction.SCISSORS;
        }
    }

    private GameAction getGameActionFromInt(int output) {
        if (output == 0) {
            return GameAction.ROCK;
        } else if (output == 1) {
            return GameAction.PAPER;
        } else {
            return GameAction.SCISSORS;
        }
    }

}
