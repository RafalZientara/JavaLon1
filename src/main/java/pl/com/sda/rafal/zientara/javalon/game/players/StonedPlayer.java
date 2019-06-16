package pl.com.sda.rafal.zientara.javalon.game.players;

import pl.com.sda.rafal.zientara.javalon.game.GameAction;

public class StonedPlayer implements Player {

    public GameAction chooseAction() {
        return GameAction.ROCK;
    }

    @Override
    public String getNick() {
        return "Snoop dog";
    }

}
