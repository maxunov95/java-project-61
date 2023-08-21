package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;

public class Calc implements Game {
    private static final int ADDITION_CODE = 0;
    private static final int SUBTRACTION_CODE = 1;
    private static final int MULTIPLICATION_CODE = 2;
    @Override
    public void showRules() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public Question getNewQuestion() {
        int operationRandomInteger = (int) (Math.random() * 3);
        int firstRandomInteger = (int) (Math.random() * 5);
        int secondRandomInteger = (int) (Math.random() * 5);

        String operation;
        String correctAnswer;

        if (operationRandomInteger == ADDITION_CODE) {
            operation = " + ";
            correctAnswer = Integer.toString(firstRandomInteger + secondRandomInteger);
        } else if (operationRandomInteger == SUBTRACTION_CODE) {
            operation = " - ";
            correctAnswer = Integer.toString(firstRandomInteger - secondRandomInteger);
        } else {
            operation = " * ";
            correctAnswer = Integer.toString(firstRandomInteger * secondRandomInteger);
        }
        String sample = firstRandomInteger + operation + secondRandomInteger;

        return new Question(sample, correctAnswer);
    }
}
