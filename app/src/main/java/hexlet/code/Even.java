package hexlet.code;

import java.util.Scanner;

public class Even {
    private static final int REQUIRED_COUNT_CORRECT_ANSWERS = 3;

    public static void start() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int countCorrectAnswers = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        while (countCorrectAnswers < REQUIRED_COUNT_CORRECT_ANSWERS) {

            int currentNumber = (int) (Math.random() * 1000000);

            System.out.println("Question: " + currentNumber + " ");
            System.out.print("Your answer: ");

            String currentAnswer = scanner.next();
            String requiredAnswer = (currentNumber % 2 == 0 ? "yes" : "no");

            if (currentAnswer.equals(requiredAnswer)) {
                System.out.println("Correct!");
                countCorrectAnswers++;
            } else {
                System.out.println(
                        "'" + currentAnswer + "' is wrong answer ;(. Correct answer was '" + requiredAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
