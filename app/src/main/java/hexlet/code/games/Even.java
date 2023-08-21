package hexlet.code.games;

public class Even {
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static void updateQuestion() {
        int randomInteger = (int) (Math.random() * 1000000);

        sample = Integer.toString(randomInteger);
        correctAnswer = (randomInteger % 2 == 0 ? "yes" : "no");
    }

    public static String getSample() {
        return sample;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
