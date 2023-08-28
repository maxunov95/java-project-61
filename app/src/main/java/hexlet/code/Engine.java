package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_COUNT_ROUNDS = 3;
    public static final int INDEX_ROUND_QUESTION = 0;
    public static final int INDEX_ROUND_ANSWER = 1;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void run(String rules, String[][] rounds) {
        String userName = greetUser();
        System.out.println(rules);

        for (int i = 0; i < MAX_COUNT_ROUNDS; i++) {
            System.out.printf("Question: %s%nYour answer: ", rounds[i][0]);

            String userAnswer = SCANNER.next();
            if (rounds[i][1].equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%nLet's try again, %s!%n",
                        userAnswer, rounds[i][1], userName);
                break;
            }

            if (i == MAX_COUNT_ROUNDS - 1) {
                System.out.printf("Congratulations, %s!%n", userName);
            }
        }
    }

    public static String greetUser() {
        System.out.printf("Welcome to the Brain Games!%nMay I have your name? ");
        String userName = SCANNER.next();
        System.out.printf("Hello, %s!%n", userName);
        return userName;
    }

    public static String getUserAnswer() {
        return SCANNER.next();
    }
}
