package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void run() {
        final String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int minValue = 0;
            final int maxValue = 10000;
            int randomNumber = Utils.getRandomNumber(minValue, maxValue);
            rounds[i][Engine.INDEX_ROUND_QUESTION] = Integer.toString(randomNumber);
            rounds[i][Engine.INDEX_ROUND_ANSWER] = (randomNumber % 2 == 0 ? "yes" : "no");
        }
        Engine.run(rules, rounds);
    }
}
