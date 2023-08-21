package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;

public class Progression implements Game {
    @Override
    public void showRules() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public Question getNewQuestion() {
        int firstRandomInteger = 1 + (int) (Math.random() * 10);
        int secondRandomInteger = 1 + (int) (Math.random() * 10);
        int randomTerm = 1 + (int) (Math.random() * 10);
        StringBuilder stringBuilder = new StringBuilder();
        String correctAnswer = "";

        int currentInteger = firstRandomInteger;
        for (int i = 0; i < 10; i++) {
            currentInteger = currentInteger + randomTerm;
            if (i == secondRandomInteger) {
                stringBuilder.append("... ");
                correctAnswer = Integer.toString(currentInteger);
            } else {
                stringBuilder.append(currentInteger).append(" ");
            }
        }

        return new Question(stringBuilder.toString().trim(), correctAnswer);
    }
}
