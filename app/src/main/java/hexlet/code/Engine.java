package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name;
    public final static int correctAnsw = 3;
    public final static int minRange = 10;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Engine.name = name;
    }

    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");


        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static int getAnswerInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getAnswerString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void congratulations() {
        System.out.println("Congratulations, " + name + "!");
    }

    public static void againMessage(int rightAnsw, int badAnsw) {
        System.out.println("'" + badAnsw + "' is wrong answer ;(. Correct answer was '" + rightAnsw + "'.");
        System.out.println("Let's try again, " + name + "!");
    }

    public static void againMessage(String rightAnsw, String wrongAnsw) {
        System.out.println("'" + wrongAnsw + "' is wrong answer ;(. Correct answer was '" + rightAnsw + "'");
        System.out.println("Let's try again, " + name + "!");
    }

    public static int rnd(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static int rnd() {
        return (int) (Math.random() * minRange);
    }

}
