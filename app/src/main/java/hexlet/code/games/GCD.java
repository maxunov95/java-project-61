package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void run() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int maxValue = 5;
            int firstNumber = Utils.getRandomNumber(0, maxValue);
            int secondNumber = Utils.getRandomNumber(0, maxValue);

            rounds[i][0] = firstNumber + " " + secondNumber;
            rounds[i][1] = Integer.toString(gcd(firstNumber, secondNumber));
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
