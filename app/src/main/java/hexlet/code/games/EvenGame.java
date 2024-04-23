package hexlet.code.games;
import static hexlet.code.Engine.CORRECT_ANSW;
import hexlet.code.Engine;

public class EvenGame {

    public static void startGame() {
        Engine.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var isAnswright = true;
        var attempts = 0;

        while (isAnswright && attempts < CORRECT_ANSW) {
            var numb = Engine.rnd();
            System.out.println("Question: " + numb);
            System.out.println("Your answer: ");


            var playerAnsw = Engine.getAnswerString();
            if (isEven(numb) && playerAnsw.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
                attempts++;
            }
            if (isEven(numb) && playerAnsw.equalsIgnoreCase("no")) {
                isAnswright = false;
                Engine.againMessage("yes", "no");
            }
            if (!(isEven(numb)) && playerAnsw.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                attempts++;
            }
            if (!(isEven(numb)) && playerAnsw.equalsIgnoreCase("yes")) {
                Engine.againMessage("no", "yes");
                isAnswright = false;
            }

        }
        if (attempts == CORRECT_ANSW) {
            Engine.congratulations();
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

}
