package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;

public class GCD implements Game {
    @Override
    public void showRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public Question getNewQuestion() {
        int firstRandomInteger = 2 + (int) (Math.random() * 5);
        int secondRandomInteger = 2 + (int) (Math.random() * 5);
        int randomFactor = 2 + (int) (Math.random() * 3);
        int difference = firstRandomInteger - secondRandomInteger;
        String correctAnswer;

        if (difference < 0) {
            correctAnswer = Integer.toString(firstRandomInteger);
            secondRandomInteger = firstRandomInteger * (randomFactor - 1);
            firstRandomInteger = firstRandomInteger * randomFactor;
        } else {
            correctAnswer = Integer.toString(secondRandomInteger);
            firstRandomInteger = secondRandomInteger * randomFactor;
            secondRandomInteger = secondRandomInteger * (randomFactor - 1);
        }
        String sample = firstRandomInteger + " " + secondRandomInteger;

        return new Question(sample, correctAnswer);
    }
}
