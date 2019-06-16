package pl.com.sda.rafal.zientara.javalon.game.players;

import pl.com.sda.rafal.zientara.javalon.game.GameAction;

public interface Player {

    default GameAction chooseAction() {
        return GameAction.ROCK;
    }

    String getNick();

}
