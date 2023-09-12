package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 5;

    public static void run() throws Exception {
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run("What is the result of the expression?", rounds);
    }

    private static String[] generateRoundData() throws Exception {
        int randomNumber = Utils.getRandomNumber(MIN_VALUE, OPERATORS.length - 1);
        String operator = OPERATORS[randomNumber];
        int firstNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int secondNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);

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
