package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 20;

    public static void run() {
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run("Answer 'yes' if given number is prime. Otherwise answer 'no'.", rounds);
    }

    private static String[] generateRoundData() {
        int randomNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);

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
