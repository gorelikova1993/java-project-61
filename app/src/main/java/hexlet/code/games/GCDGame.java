package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    public static void startGame() {
        Engine.greetings();
        boolean rightAnsw = true;
        int attempts = 1;

        while (rightAnsw && attempts < 4) {
            int numb1 = (int) (Math.random() * 10);
            int numb2 = (int) (Math.random() * 10);

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
