package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int greetGameCode = 1;
        int evenGameCode = 2;
        int exitCode = 0;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(greetGameCode + " - Greet");
        System.out.println(evenGameCode + " - Even");
        System.out.println(exitCode + " - Exit");

        int currentGameCode = getNewCurrentGameCode();

        while (currentGameCode != exitCode) {
            if (currentGameCode == greetGameCode) {
                Cli.greet();
            } else if (currentGameCode == evenGameCode) {
                Even.start();
            }
            currentGameCode = getNewCurrentGameCode();
        }
    }

    private static int getNewCurrentGameCode() {
        int currentGameCode;

        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        currentGameCode = scanner.nextInt();

        System.out.println(currentGameCode);

        return currentGameCode;
    }
}
