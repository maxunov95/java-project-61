package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 5;

    public static void run() {
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run("Find the greatest common divisor of given numbers.", rounds);
    }

    private static String[] generateRoundData() {
        int firstNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int secondNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);

        String question = firstNumber + " " + secondNumber;
        String answer = getAnswer(firstNumber, secondNumber);

        return new String[] {question, answer};
    }

    private static String getAnswer(int firstNumber, int secondNumber) {
        return Integer.toString(gcd(firstNumber, secondNumber));
    }

    private static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}
