package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;

public class Even implements Game {
    @Override
    public void showRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    public Question getNewQuestion() {
        int randomInteger = (int) (Math.random() * 1000000);
        String correctAnswer = (randomInteger % 2 == 0 ? "yes" : "no");

        return new Question(Integer.toString(randomInteger), correctAnswer);
    }
}
