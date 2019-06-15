package pl.com.sda.rafal.zientara.javalon.game.players;

import pl.com.sda.rafal.zientara.javalon.game.GameAction;

public abstract class AbstractPlayer {

    private final String name;

    protected AbstractPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract GameAction chooseAction();
}
