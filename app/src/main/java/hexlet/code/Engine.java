package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_COUNT_ROUNDS = 3;

    public static void run(String rules, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
        String userName = greetUser(scanner);
        System.out.println(rules);

        for (int i = 0; i < MAX_COUNT_ROUNDS; i++) {
            System.out.printf("Question: %s%nYour answer: ", rounds[i][0]);

            String userAnswer = scanner.next();
            if (!rounds[i][1].equals(userAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%nLet's try again, %s!%n",
                        userAnswer, rounds[i][1], userName);
                scanner.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!%n", userName);
        scanner.close();
    }

    public static String greetUser(Scanner scanner) {
        System.out.printf("Welcome to the Brain Games!%nMay I have your name? ");
        String userName = scanner.next();
        System.out.printf("Hello, %s!%n", userName);
        return userName;
    }
}
