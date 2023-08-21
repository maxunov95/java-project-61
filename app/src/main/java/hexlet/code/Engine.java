package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

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

    private static int currentGameCode;
    private static String userName = "NoNameUser";

    public static void start() {
        do {
            showMenu();

            if (currentGameCode == GREET_CODE) {
                greetUser();
                continue;
            }

            Game currentGame = getCurrentGame();
            if (currentGame == null) {
                continue;
            }

            greetUser();
            currentGame.showRules();
            playGame(currentGame);

        } while (currentGameCode != EXIT_CODE);
    }

    public static void showMenu() {
        System.out.printf("%nPlease enter the game number and press Enter.%n");
        System.out.println(GREET_CODE + " - Greet");
        System.out.println(EVEN_GAME_CODE + " - Even");
        System.out.println(CALCULATOR_GAME_CODE + " - Calc");
        System.out.println(GCD_GAME_CODE + " - GCD");
        System.out.println(PROGRESSION_GAME_CODE + " - Progression");
        System.out.println(EXIT_CODE + " - Exit");

        System.out.print("Your choice: ");

        currentGameCode = SCANNER.nextInt();
    }

    private static Game getCurrentGame() {
        return switch (currentGameCode) {
            case (EVEN_GAME_CODE) -> new Even();
            case (CALCULATOR_GAME_CODE) -> new Calc();
            case (GCD_GAME_CODE) -> new GCD();
            case (PROGRESSION_GAME_CODE) -> new Progression();
            default -> null;
        };
    }

    public static void greetUser() {
        System.out.printf("Welcome to the Brain Games!%nMay I have your name? ");

        userName = SCANNER.next();
        System.out.printf("Hello, %s!%n", userName);
    }

    private static void playGame(Game currentGame) {
        int countCorrectAnswers = 0;
        while (countCorrectAnswers < MAX_COUNT_ROUNDS) {
            Question question = currentGame.getNewQuestion();
            question.ask();

            String userAnswer = SCANNER.next();
            if (question.userAnswerIsCorrect(userAnswer, userName)) {
                countCorrectAnswers++;
            } else {
                break;
            }

            if (countCorrectAnswers == MAX_COUNT_ROUNDS) {
                System.out.printf("Congratulations, %s!%n", userName);
            }
        }
    }
}
