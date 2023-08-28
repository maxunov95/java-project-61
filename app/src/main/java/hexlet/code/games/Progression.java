package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void run() {
        final String rules = "What number is missing in the progression?";
        final String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int minValue = 1;
            final int maxValue = 10;
            final int progressionSize = 10;
            int firstNumber = Utils.getRandomNumber(minValue, maxValue);
            int secondNumber = Utils.getRandomNumber(minValue, maxValue);
            int randomTerm = Utils.getRandomNumber(minValue, maxValue);
            StringBuilder stringBuilder = new StringBuilder();

            int currentInteger = firstNumber;
            for (int k = 0; k < progressionSize; k++) {
                currentInteger = currentInteger + randomTerm;
                if (k != secondNumber - 1) {
                    stringBuilder.append(currentInteger).append(" ");
                } else {
                    stringBuilder.append(".. ");
                }
            }
            rounds[i][Engine.INDEX_ROUND_QUESTION] = stringBuilder.toString().trim();
            rounds[i][Engine.INDEX_ROUND_ANSWER] = Integer.toString(firstNumber + (secondNumber * randomTerm));
        }
        Engine.run(rules, rounds);
    }
}
