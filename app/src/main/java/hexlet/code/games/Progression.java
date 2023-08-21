package hexlet.code.games;

public class Progression {
    private static String sample;
    private static String correctAnswer;

    public static void showRules() {
        System.out.println("What number is missing in the progression?");
    }

    public static void updateQuestion() {
        int minValue = 1;
        int maxValue = 10;
        int firstRandomInteger = minValue + (int) (Math.random() * maxValue);
        int secondRandomInteger = minValue + (int) (Math.random() * maxValue);
        int randomTerm = minValue + (int) (Math.random() * maxValue);
        StringBuilder stringBuilder = new StringBuilder();

        int currentInteger = firstRandomInteger;
        for (int i = 0; i < 10; i++) {
            currentInteger = currentInteger + randomTerm;
            if (i != secondRandomInteger - 1) {
                stringBuilder.append(currentInteger).append(" ");
            } else {
                stringBuilder.append(".. ");
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
