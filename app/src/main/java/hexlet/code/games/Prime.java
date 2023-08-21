package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;

public class Prime implements Game {
    @Override
    public void showRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public Question getNewQuestion() {
        int randomInteger = (int) (Math.random() * 20);
        String correctAnswer = (checkIsItPrimeNumber(randomInteger) ? "yes" : "no");

        return new Question(Integer.toString(randomInteger), correctAnswer);
    }

    private static boolean checkIsItPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
