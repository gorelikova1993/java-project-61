package hexlet.code.games;
import hexlet.code.Engine;

import static hexlet.code.Engine.correctAnsw;

public class GCDGame {
    public static void startGame() {
        Engine.greetings();
        boolean rightAnsw = true;
        int attempts = 0;

        while (rightAnsw && attempts < correctAnsw) {
            int numb1 = Engine.rnd();
            int numb2 = Engine.rnd();

            int rightGcd = gcd(numb1, numb2);

            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + numb1 + " " + numb2);

            System.out.println("Your answer: ");

            int playerAnsw = Engine.getAnswerInt();

            if (playerAnsw == rightGcd) {
                System.out.println("Correct!");
                attempts++;
            } else {
                rightAnsw = false;
                Engine.againMessage(rightGcd, playerAnsw);
            }

        }
        if (attempts == correctAnsw) {
            Engine.congratulations();
        }


    }

    public static int gcd(int a, int b) {
        int result = 0;
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }
}
