package hexlet.code.games;

public class GCD {
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void updateQuestion() {
        int minValue = 2;
        int maxValue = 5;
        int maxValueFactor = 3;
        int firstRandomInteger = minValue + (int) (Math.random() * maxValue);
        int secondRandomInteger = minValue + (int) (Math.random() * maxValue);
        int randomFactor = minValue + (int) (Math.random() * maxValueFactor);
        int difference = firstRandomInteger - secondRandomInteger;

        if (difference < 0) {
            correctAnswer = Integer.toString(firstRandomInteger);
            secondRandomInteger = firstRandomInteger * (randomFactor - 1);
            firstRandomInteger = firstRandomInteger * randomFactor;
        } else {
            correctAnswer = Integer.toString(secondRandomInteger);
            firstRandomInteger = secondRandomInteger * randomFactor;
            secondRandomInteger = secondRandomInteger * (randomFactor - 1);
        }
        sample = firstRandomInteger + " " + secondRandomInteger;
    }

    public static String getSample() {
        return sample;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
