package pl.com.sda.rafal.zientara.javalon.gameCopy.game.players;

import pl.com.sda.rafal.zientara.javalon.gameCopy.game.GameAction;

import java.util.Scanner;

public class ScannerPlayer extends AbstractPlayer {

    public ScannerPlayer(String name) {
        super(name);
    }

    public GameAction chooseAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getName() + "! Wpisz akcje r/p/s");

//        return getGameActionRecurrence(scanner);
        return getGameActionWithWhileAndSwitch(scanner);
    }

    private GameAction getGameActionWithWhileAndSwitch(Scanner scanner) {
        while (true) {
            String input = scanner
                    .next()
                    .toLowerCase();
            switch (input) {
                case "r":
                case "rock":
                    return GameAction.ROCK;
                case "p":
                case "paper":
                    return GameAction.PAPER;
                case "s":
                case "scissors":
                    return GameAction.SCISSORS;
                default:
                    System.out.println("Nope");
            }
        }
    }

    private GameAction getGameActionRecurrence(Scanner scanner) {
        String input = scanner.next();
        if (input.equalsIgnoreCase("r")) {
            return GameAction.ROCK;
        } else if (input.equalsIgnoreCase("p")) {
            return GameAction.PAPER;
        } else if (input.equalsIgnoreCase("s")) {
            return GameAction.SCISSORS;
        }
        //rekurencja!
        return getGameActionRecurrence(scanner);
    }
}
