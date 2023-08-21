package hexlet.code.games;

public class Progression {
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("What number is missing in the progression?");
    }

    public static void updateQuestion() {
        final int minNumber = 1;
        final int maxNumber = 10;

        int firstRandomNumber = minNumber + (int) (Math.random() * maxNumber);
        int secondRandomNumber = minNumber + (int) (Math.random() * maxNumber);
        int randomTerm = minNumber + (int) (Math.random() * maxNumber);
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
