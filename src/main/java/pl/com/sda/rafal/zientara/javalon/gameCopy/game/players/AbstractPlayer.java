package pl.com.sda.rafal.zientara.javalon.gameCopy.game.players;

import pl.com.sda.rafal.zientara.javalon.gameCopy.game.GameAction;

public abstract class AbstractPlayer {

    private final String name;

    public AbstractPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract GameAction chooseAction();
}
