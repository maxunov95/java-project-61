package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void run() {
        final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int minValue = 0;
            final int maxValue = 20;
            int randomNumber = Utils.getRandomNumber(minValue, maxValue);

            rounds[i][Engine.INDEX_ROUND_QUESTION] = Integer.toString(randomNumber);
            rounds[i][Engine.INDEX_ROUND_ANSWER] = (checkIsItPrimeNumber(randomNumber) ? "yes" : "no");
        }
        Engine.run(rules, rounds);
    }

    private static boolean checkIsItPrimeNumber(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
