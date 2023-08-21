package hexlet.code.games;

public class Progression {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("What number is missing in the progression?");
    }

    public static void updateQuestion() {
        int firstRandomNumber = MIN_NUMBER + (int) (Math.random() * MAX_NUMBER);
        int secondRandomNumber = MIN_NUMBER + (int) (Math.random() * MAX_NUMBER);
        int randomTerm = MIN_NUMBER + (int) (Math.random() * MAX_NUMBER);
        StringBuilder stringBuilder = new StringBuilder();

        int currentInteger = firstRandomNumber;
        for (int i = 0; i < 10; i++) {
            currentInteger = currentInteger + randomTerm;
            if (i != secondRandomNumber - 1) {
                stringBuilder.append(currentInteger).append(" ");
            } else {
                stringBuilder.append(".. ");
            }
        }

        sample = stringBuilder.toString().trim();
        correctAnswer = Integer.toString(firstRandomNumber + (secondRandomNumber * randomTerm));
    }

    public static String getSample() {
        return sample;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
