package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String name;

    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");


        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static int returnAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void againMessage(int rightAnsw, int badAnsw) {
        System.out.println("'" + badAnsw + "' is wrong answer ;(. Correct answer was '" + rightAnsw + "'.");
        System.out.println("Let's try again, " + name + "!");
    }

    public static int rnd(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

}