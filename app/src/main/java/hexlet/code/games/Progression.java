package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void run() {
        String rules = "What number is missing in the progression?";
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            final int progressionSize = 10;
            int firstNumber = Utils.getRandomNumber(1, 10);
            int secondNumber = Utils.getRandomNumber(1, 10);
            int randomTerm = Utils.getRandomNumber(1, 10);
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
            rounds[i][0] = stringBuilder.toString().trim();
            rounds[i][1] = Integer.toString(firstNumber + (secondNumber * randomTerm));
        }
        Engine.run(rules, rounds);
    }
}
