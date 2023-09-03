package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void run() {
        final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rules, rounds);
    }

    private static String[] generateRoundData() {
        final int minValue = 0;
        final int maxValue = 20;
        int randomNumber = Utils.getRandomNumber(minValue, maxValue);

        String question = Integer.toString(randomNumber);
        String answer = getAnswer(randomNumber);

        return new String[] {question, answer};
    }

    private static String getAnswer(int randomNumber) {
        return checkIsItPrimeNumber(randomNumber) ? "yes" : "no";
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
