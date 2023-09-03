package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void run() {
        final String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rules, rounds);
    }

    private static String[] generateRoundData() {
        final int minValue = 0;
        final int maxValue = 10000;
        int randomNumber = Utils.getRandomNumber(minValue, maxValue);
        String question = Integer.toString(randomNumber);
        String answer = getAnswer(randomNumber);

        return new String[] {question, answer};
    }

    private static String getAnswer(int randomNumber) {
        return randomNumber % 2 == 0 ? "yes" : "no";
    }
}
