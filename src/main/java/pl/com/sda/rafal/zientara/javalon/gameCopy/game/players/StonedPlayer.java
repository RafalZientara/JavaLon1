package pl.com.sda.rafal.zientara.javalon.gameCopy.game.players;

import pl.com.sda.rafal.zientara.javalon.gameCopy.game.GameAction;

public class StonedPlayer extends AbstractPlayer {

    public StonedPlayer(String name) {
        super(name);
    }

    public StonedPlayer() {
        super("Snoop dog");
    }

    public GameAction chooseAction() {
        return GameAction.ROCK;
    }

}
