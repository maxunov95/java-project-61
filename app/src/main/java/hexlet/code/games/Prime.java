package hexlet.code.games;

public class Prime {
    private static final int MAX_NUMBER = 20;
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static void updateQuestion() {
        int randomNumber = (int) (Math.random() * MAX_NUMBER);

        sample = Integer.toString(randomNumber);
        correctAnswer = (checkIsItPrimeNumber(randomNumber) ? "yes" : "no");
    }

    private static boolean checkIsItPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getSample() {
        return sample;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
