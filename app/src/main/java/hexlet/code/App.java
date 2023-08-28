package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("""
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit
            Your choice:\s""");

        String userChoice = Engine.getUserAnswer();

        switch (userChoice) {
            case ("1") -> Engine.greetUser();
            case ("2") -> Even.run();
            case ("3") -> Calc.run();
            case ("4") -> GCD.run();
            case ("5") -> Progression.run();
            case ("6") -> Prime.run();
            default -> { }
        }
    }
}
