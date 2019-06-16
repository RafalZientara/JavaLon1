package pl.com.sda.rafal.zientara.javalon.game.players;

import pl.com.sda.rafal.zientara.javalon.game.GameAction;

import java.util.Scanner;

public class ScannerPlayer implements Player {

    public GameAction chooseAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz akcje r/p/s");

//        return getGameActionRecurrence(scanner);
        return getGameActionWithWhileAndSwitch(scanner);
    }

    @Override
    public String getNick() {
        return "Scanner";
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
