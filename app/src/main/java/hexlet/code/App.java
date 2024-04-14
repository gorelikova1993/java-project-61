package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
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
            default:
                break;
        }
    }
}
