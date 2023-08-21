package hexlet.code.games;

public class Calc {
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("What is the result of the expression?");
    }

    public static void updateQuestion() {
        final int additionCode = 0;
        final int subtractionCode = 1;
        final int maxOperation = 3;
        final int maxNumber = 5;
        int operationRandomNumber = (int) (Math.random() * maxOperation);
        int firstRandomNumber = (int) (Math.random() * maxNumber);
        int secondRandomNumber = (int) (Math.random() * maxNumber);
        String operation;

        if (operationRandomNumber == additionCode) {
            operation = " + ";
            correctAnswer = Integer.toString(firstRandomNumber + secondRandomNumber);
        } else if (operationRandomNumber == subtractionCode) {
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
