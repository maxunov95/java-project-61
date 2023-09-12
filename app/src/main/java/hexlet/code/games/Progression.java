package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 10;
    private static final int PROGRESSION_SIZE = 10;

    public static void run() {
        String[][] rounds = new String[Engine.MAX_COUNT_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_COUNT_ROUNDS; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run("What number is missing in the progression?", rounds);
    }

    private static String[] generateRoundData() {
        int firstNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
        int hiddenIndex = Utils.getRandomNumber(0, PROGRESSION_SIZE - 1);
        int randomTerm = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);

        String[] progression = getProgression(firstNumber, randomTerm);

        String answer = progression[hiddenIndex];
        progression[hiddenIndex] = "..";
        String question = String.join(" ", progression);

        return new String[] {question, answer};
    }

    private static String[] getProgression(int firstNumber, int randomTerm) {
        String[] progression = new String[PROGRESSION_SIZE];
        int currentInteger = firstNumber;
        for (int i = 0; i < PROGRESSION_SIZE; i++) {
            currentInteger = currentInteger + randomTerm;
            progression[i] = Integer.toString(currentInteger);
        }
        return progression;
    }
}
