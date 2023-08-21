package hexlet.code.games;

public class Calc {
    private static final int ADDITION_CODE = 0;
    private static final int SUBTRACTION_CODE = 1;
    private static final int MULTIPLICATION_CODE = 2;
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("What is the result of the expression?");
    }

    public static void updateQuestion() {
        int operationRandomInteger = (int) (Math.random() * 3);
        int firstRandomInteger = (int) (Math.random() * 5);
        int secondRandomInteger = (int) (Math.random() * 5);

        String operation;

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
        sample = firstRandomInteger + operation + secondRandomInteger;
    }

    public static String getSample() {
        return sample;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
