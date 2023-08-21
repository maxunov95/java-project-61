package hexlet.code.games;

public class GCD {
    private static final int MIN_NUMBER = 2;
    private static final int MAX_NUMBER = 5;
    private static final int MAX_FACTOR = 3;
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void updateQuestion() {
        int firstRandomNumber = MIN_NUMBER + (int) (Math.random() * MAX_NUMBER);
        int secondRandomNumber = MIN_NUMBER + (int) (Math.random() * MAX_NUMBER);
        int randomFactor = MIN_NUMBER + (int) (Math.random() * MAX_FACTOR);
        int difference = firstRandomNumber - secondRandomNumber;

        if (difference < 0) {
            correctAnswer = Integer.toString(firstRandomNumber);
            secondRandomNumber = firstRandomNumber * (randomFactor - 1);
            firstRandomNumber = firstRandomNumber * randomFactor;
        } else {
            correctAnswer = Integer.toString(secondRandomNumber);
            firstRandomNumber = secondRandomNumber * randomFactor;
            secondRandomNumber = secondRandomNumber * (randomFactor - 1);
        }
        sample = firstRandomNumber + " " + secondRandomNumber;
    }

    public static String getSample() {
        return sample;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
