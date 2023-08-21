package hexlet.code.games;

public class Calc {
    private static final int ADDITION_CODE = 0;
    private static final int SUBTRACTION_CODE = 1;
    private static final int MAX_OPERATION = 3;
    private static final int MAX_NUMBER = 5;
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("What is the result of the expression?");
    }

    public static void updateQuestion() {
        int operationRandomNumber = (int) (Math.random() * MAX_OPERATION);
        int firstRandomNumber = (int) (Math.random() * MAX_NUMBER);
        int secondRandomNumber = (int) (Math.random() * MAX_NUMBER);

        String operation;

        if (operationRandomNumber == ADDITION_CODE) {
            operation = " + ";
            correctAnswer = Integer.toString(firstRandomNumber + secondRandomNumber);
        } else if (operationRandomNumber == SUBTRACTION_CODE) {
            operation = " - ";
            correctAnswer = Integer.toString(firstRandomNumber - secondRandomNumber);
        } else {
            operation = " * ";
            correctAnswer = Integer.toString(firstRandomNumber * secondRandomNumber);
        }
        sample = firstRandomNumber + operation + secondRandomNumber;
    }

    public static String getSample() {
        return sample;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
