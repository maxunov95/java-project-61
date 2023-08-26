package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {

        final String exitCode = "0";
        final String greetCode = "1";
        final String evenGameCode = "2";
        final String calculatorGameCode = "3";
        final String gcdGameCode = "4";
        final String progressionGameCode = "5";
        final String primeGameCode = "6";

        System.out.printf("%nPlease enter the game number and press Enter.%n");
        System.out.println(greetCode + " - Greet");
        System.out.println(evenGameCode + " - Even");
        System.out.println(calculatorGameCode + " - Calc");
        System.out.println(gcdGameCode + " - GCD");
        System.out.println(progressionGameCode + " - Progression");
        System.out.println(primeGameCode + " - Prime");
        System.out.println(exitCode + " - Exit");
        System.out.print("Your choice: ");

        String userChoice = Utils.getUserAnswer();

        switch (userChoice) {
            case (evenGameCode) -> Even.run();
            case (calculatorGameCode) -> Calc.run();
            case (gcdGameCode) -> GCD.run();
            case (progressionGameCode) -> Progression.run();
            case (primeGameCode) -> Prime.run();
            case (greetCode) -> Engine.greetUser();
            default -> { }
        }
    }
}
