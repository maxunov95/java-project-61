package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void run() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int maxValue = 20;
            int randomNumber = Utils.getRandomNumber(0, maxValue);

            rounds[i][0] = Integer.toString(randomNumber);
            rounds[i][1] = (checkIsItPrimeNumber(randomNumber) ? "yes" : "no");
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
