package hexlet.code.games;

public class Progression {
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("What number is missing in the progression?");
    }

    public static void updateQuestion() {
        int firstRandomInteger = 1 + (int) (Math.random() * 10);
        int secondRandomInteger = 1 + (int) (Math.random() * 10);
        int randomTerm = 1 + (int) (Math.random() * 10);
        StringBuilder stringBuilder = new StringBuilder();

        int currentInteger = firstRandomInteger;
        for (int i = 0; i < 10; i++) {
            currentInteger = currentInteger + randomTerm;
            if (i != secondRandomInteger - 1) {
                stringBuilder.append(currentInteger).append(" ");
            } else {
                stringBuilder.append("... ");
            }
        }

        sample = stringBuilder.toString().trim();
        correctAnswer = Integer.toString(firstRandomInteger + (secondRandomInteger * randomTerm));
    }

    public static String getSample() {
        return sample;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }
}
