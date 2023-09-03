package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void run() {
        final String rules = "What number is missing in the progression?";
        final String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rules, rounds);
    }

    private static String[] generateRoundData() {
        final int minValue = 1;
        final int maxValue = 10;
        int firstNumber = Utils.getRandomNumber(minValue, maxValue);
        int secondNumber = Utils.getRandomNumber(minValue, maxValue);
        int randomTerm = Utils.getRandomNumber(minValue, maxValue);

        String question = getQuestion(firstNumber, randomTerm, secondNumber);
        String answer = getAnswer(firstNumber, secondNumber, randomTerm);

        return new String[] {question, answer};
    }

    private static String getQuestion(int firstNumber, int randomTerm, int secondNumber) {
        final int progressionSize = 10;
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
        return stringBuilder.toString().trim();
    }

    private static String getAnswer(int firstNumber, int secondNumber, int randomTerm) {
        return Integer.toString(firstNumber + (secondNumber * randomTerm));
    }
}
