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
        final int progressionSize = 10;
        int firstNumber = Utils.getRandomNumber(minValue, maxValue);
        int hiddenIndex = Utils.getRandomNumber(0, progressionSize - 1);
        int randomTerm = Utils.getRandomNumber(minValue, maxValue);

        String[] progression = getProgression(progressionSize, firstNumber, randomTerm);

        String answer = progression[hiddenIndex];
        String question = getQuestion(progression, hiddenIndex);

        return new String[] {question, answer};
    }

    private static String[] getProgression(int progressionSize, int firstNumber, int randomTerm) {
        String[] progression = new String[progressionSize];
        int currentInteger = firstNumber;
        for (int i = 0; i < progressionSize; i++) {
            currentInteger = currentInteger + randomTerm;
            progression[i] = Integer.toString(currentInteger);
        }
        return progression;
    }

    private static String getQuestion(String[] progression, int hiddenIndex) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i != hiddenIndex) {
                stringBuilder.append(progression[i]).append(" ");
            } else {
                stringBuilder.append(".. ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
