package hexlet.code;

import java.util.Scanner;

public class Utils {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String getUserAnswer() {
        return SCANNER.next();
    }

    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * max);
    }
}
