package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT_ANSW;

public class PrimeGame {

    public static void startGame() {
        Engine.greetings();
        boolean isPlaying = true;
        int attempts = 0;

        while (isPlaying && attempts < CORRECT_ANSW) {
            int numb = Engine.rnd();
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            System.out.println("Question: " + numb);
            String playerAnsw = Engine.getAnswerString();
            String rightAnsw = yesOrNo(isPrime(numb));
            if (playerAnsw.equalsIgnoreCase(rightAnsw)) {
                System.out.println("Correct!");
                attempts++;
            } else {
                Engine.againMessage(rightAnsw, playerAnsw);
                isPlaying = false;
            }
        }
        if (attempts == CORRECT_ANSW) {
            Engine.congratulations();
        }

    }

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if ((a % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static String yesOrNo(boolean flag) {
        if (flag) {
            return "yes";
        }
        return "no";
    }
}
