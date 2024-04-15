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
        int answ = scanner.nextInt();
        return answ;
    }
//TODO add mes(is wrong answ correct bla bla)
    public static void againMessage() {
        System.out.println("Let's try again, " + name + "!");
    }

}
