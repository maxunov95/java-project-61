package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void run() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int maxValue = 10000;
            int randomNumber = Utils.getRandomNumber(0, maxValue);
            rounds[i][0] = Integer.toString(randomNumber);
            rounds[i][1] = (randomNumber % 2 == 0 ? "yes" : "no");
        }
        Engine.run(rules, rounds);
    }
}
