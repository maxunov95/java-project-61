package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 10000;

    public static void run() {
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run("Answer 'yes' if the number is even, otherwise answer 'no'.", rounds);
    }

    private static String[] generateRoundData() {
        int randomNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        String question = Integer.toString(randomNumber);
        String answer = (isEven(randomNumber)  ? "yes" : "no");

        return new String[] {question, answer};
    }

    private static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
