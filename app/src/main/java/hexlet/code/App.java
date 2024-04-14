package hexlet.code;
import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        var choice = scanner.next();
        switch (choice) {
            case "1":
                System.out.println("Your choice: " + choice);
                Cli.askName();
                break;
            case "2":
                System.out.println("Your choice: " + choice);
                EvenGame.startGame();
                break;
            case "3":
                System.out.println("Your choice: " + choice);
                CalcGame.startGame();
            default:
                break;
        }
    }
}
