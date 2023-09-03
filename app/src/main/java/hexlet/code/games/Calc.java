package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void run() throws Exception {
        final String rules = "What is the result of the expression?";
        final String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rules, rounds);
    }

    private static String[] generateRoundData() throws Exception {
        final String[] operators = {"+", "-", "*"};
        final int minValue = 0;
        final int maxValue = 5;
        int randomNumber = Utils.getRandomNumber(minValue, operators.length - 1);
        String operator = operators[randomNumber];
        int firstNumber = Utils.getRandomNumber(minValue, maxValue);
        int secondNumber = Utils.getRandomNumber(minValue, maxValue);

        String question = firstNumber + " " + operator + " " + secondNumber;
        String answer = getAnswer(operator, firstNumber, secondNumber);
        return new String[] {question, answer};
    }

    private static String getAnswer(String operator, int firstNumber, int secondNumber) throws Exception {
        return switch (operator) {
            case ("+") -> Integer.toString(firstNumber + secondNumber);
            case ("-") -> Integer.toString(firstNumber - secondNumber);
            case ("*") -> Integer.toString(firstNumber * secondNumber);
            default -> throw new Exception();
        };
    }
}
