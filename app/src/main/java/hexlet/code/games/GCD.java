package hexlet.code.games;

public class GCD {
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void updateQuestion() {
        final int minNumber = 2;
        final int maxNumber = 5;
        final int maxFactor = 3;
        int firstRandomNumber = minNumber + (int) (Math.random() * maxNumber);
        int secondRandomNumber = minNumber + (int) (Math.random() * maxNumber);
        int randomFactor = minNumber + (int) (Math.random() * maxFactor);
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
