package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_COUNT_ROUNDS = 3;
    private static final int EXIT_CODE = 0;
    private static final int GREET_CODE = 1;
    private static final int EVEN_GAME_CODE = 2;
    private static final int CALCULATOR_GAME_CODE = 3;
    private static final int GCD_GAME_CODE = 4;
    private static final int PROGRESSION_GAME_CODE = 5;
    private static final int PRIME_GAME_CODE = 6;

    private static int currentGameCode = -1;
    private static String userName = "NoNameUser";
    private static String correctAnswer = "";

    public static void start() {
        do {
            showMenu();

            if (currentGameCode == GREET_CODE) {
                greetUser();
            } else if (currentGameCode > EXIT_CODE && currentGameCode <= PRIME_GAME_CODE) {
                playGame();
            }
        } while (currentGameCode != EXIT_CODE);
    }

    private static void showMenu() {
        System.out.printf("%nPlease enter the game number and press Enter.%n");
        System.out.println(GREET_CODE + " - Greet");
        System.out.println(EVEN_GAME_CODE + " - Even");
        System.out.println(CALCULATOR_GAME_CODE + " - Calc");
        System.out.println(GCD_GAME_CODE + " - GCD");
        System.out.println(PROGRESSION_GAME_CODE + " - Progression");
        System.out.println(PRIME_GAME_CODE + " - Prime");
        System.out.println(EXIT_CODE + " - Exit");

        System.out.print("Your choice: ");

        currentGameCode = SCANNER.nextInt();
    }

    private static void greetUser() {
        System.out.printf("Welcome to the Brain Games!%nMay I have your name? ");

        userName = SCANNER.next();
        System.out.printf("Hello, %s!%n", userName);
    }

    private static void playGame() {
        greetUser();
        showRules();

        int countCorrectAnswers = 0;
        while (countCorrectAnswers < MAX_COUNT_ROUNDS) {
            showNextQuestion();

            String userAnswer = SCANNER.next();
            if (userAnswerIsCorrect(userAnswer)) {
                countCorrectAnswers++;
            } else {
                break;
            }

            if (countCorrectAnswers == MAX_COUNT_ROUNDS) {
                System.out.printf("Congratulations, %s!%n", userName);
            }
        }
    }

    private static void showRules() {
        switch (currentGameCode) {
            case (EVEN_GAME_CODE) -> Even.showRules();
            case (CALCULATOR_GAME_CODE) -> Calc.showRules();
            case (GCD_GAME_CODE) -> GCD.showRules();
            case (PROGRESSION_GAME_CODE) -> Progression.showRules();
            case (PRIME_GAME_CODE) -> Prime.showRules();
            default -> {
            }
        }
    }

    private static void showNextQuestion() {
        switch (currentGameCode) {
            case (EVEN_GAME_CODE) -> {
                Even.updateQuestion();
                ask(Even.getSample());
                correctAnswer = Even.getCorrectAnswer();
            }
            case (CALCULATOR_GAME_CODE) -> {
                Calc.updateQuestion();
                ask(Calc.getSample());
                correctAnswer = Calc.getCorrectAnswer();
            }
            case (GCD_GAME_CODE) -> {
                GCD.updateQuestion();
                ask(GCD.getSample());
                correctAnswer = GCD.getCorrectAnswer();
            }
            case (PROGRESSION_GAME_CODE) -> {
                Progression.updateQuestion();
                ask(Progression.getSample());
                correctAnswer = Progression.getCorrectAnswer();
            }
            case (PRIME_GAME_CODE) -> {
                Prime.updateQuestion();
                ask(Prime.getSample());
                correctAnswer = Prime.getCorrectAnswer();
            }
            default -> {
            }
        }
    }

    private static void ask(String sample) {
        System.out.printf("Question: %s%nYour answer: ", sample);
    }

    private static boolean userAnswerIsCorrect(String userAnswer) {
        if (correctAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%nLet's try again, %s!%n",
                    userAnswer, correctAnswer, userName);
            return false;
        }
    }

}
