package hexlet.code.games;

public class Even {
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static void updateQuestion() {
        int maxNumber = 10000;
        int randomNumber = (int) (Math.random() * maxNumber);

        sample = Integer.toString(randomNumber);
        correctAnswer = (randomNumber % 2 == 0 ? "yes" : "no");
    }

    public static String getSample() {
        return sample;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
