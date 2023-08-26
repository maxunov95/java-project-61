package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void run() {
        String rules = "What is the result of the expression?";
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];
        String[] operators = {" + ", " - ", " * "};

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int maxValue = 5;
            int randomNumber = Utils.getRandomNumber(0, operators.length - 1);
            String operator = operators[randomNumber];
            int firstNumber = Utils.getRandomNumber(0, maxValue);
            int secondNumber = Utils.getRandomNumber(0, maxValue);

            rounds[i][0] = Integer.toString(firstNumber) + operator + Integer.toString(secondNumber);
            rounds[i][1] = switch (operator) {
                case (" + ") -> Integer.toString(firstNumber + secondNumber);
                case (" - ") -> Integer.toString(firstNumber - secondNumber);
                default -> Integer.toString(firstNumber * secondNumber);
            };
        }
        Engine.run(rules, rounds);
    }
}
