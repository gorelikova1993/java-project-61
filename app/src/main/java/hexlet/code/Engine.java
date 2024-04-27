package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MIN_RANGE = 10;
    public static final int ROUNDS = 3;


    public static void run(String[][] rounds, String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rules);

        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase(round[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + round[1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int rnd(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static int rnd() {
        return (int) (Math.random() * MIN_RANGE);
    }
}
