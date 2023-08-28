package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void run() {
        final String rules = "Find the greatest common divisor of given numbers.";
        final String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int minValue = 0;
            final int maxValue = 5;
            int firstNumber = Utils.getRandomNumber(minValue, maxValue);
            int secondNumber = Utils.getRandomNumber(minValue, maxValue);

            rounds[i][Engine.INDEX_ROUND_QUESTION] = firstNumber + " " + secondNumber;
            rounds[i][Engine.INDEX_ROUND_ANSWER] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        Engine.run(rules, rounds);
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
