package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void run() throws Exception {
        final String rules = "What is the result of the expression?";
        final String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];
        final String[] operators = {"+", "-", "*"};

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int minValue = 0;
            final int maxValue = 5;
            int randomNumber = Utils.getRandomNumber(minValue, operators.length - 1);
            String operator = operators[randomNumber];
            int firstNumber = Utils.getRandomNumber(minValue, maxValue);
            int secondNumber = Utils.getRandomNumber(minValue, maxValue);

            rounds[i][Engine.INDEX_ROUND_QUESTION] = firstNumber + " " + operator + " " + secondNumber;
            rounds[i][Engine.INDEX_ROUND_ANSWER] = switch (operator) {
                case ("+") -> Integer.toString(firstNumber + secondNumber);
                case ("-") -> Integer.toString(firstNumber - secondNumber);
                case ("*") -> Integer.toString(firstNumber * secondNumber);
                default -> throw new Exception();
            };
        }
        Engine.run(rules, rounds);
    }
}
