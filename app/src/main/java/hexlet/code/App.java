package hexlet.code;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        var choice = scanner.next();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case "1":
                Cli.askName();
                break;
            case "2":
                EvenGame.startGame();
                break;
            case "3":
                CalcGame.startGame();
                break;
            case "4":
                GCDGame.startGame();
                break;
            case "5":
                ProgressionGame.startGame();
                break;
            case "6":
                PrimeGame.startGame();
                break;
            default:
                break;
        }
    }
}
