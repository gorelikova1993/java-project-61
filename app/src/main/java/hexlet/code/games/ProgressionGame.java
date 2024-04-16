package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.correctAnsw;

public class ProgressionGame {

    public static void startGame() {
        Engine.greetings();
        boolean isPlaying = true;
        int attempts = 0;
        while (isPlaying && attempts < correctAnsw) {
            System.out.println("What number is missing in the progression?");
            int answ = generateProgression();
            System.out.println("Your answer: ");
            int playerAnsw = Engine.getAnswerInt();

            if (answ == playerAnsw) {
                System.out.println("Correct!");
                attempts++;
            } else {
                isPlaying = false;
                Engine.againMessage(answ, playerAnsw);
            }
        }

        if (attempts == correctAnsw) {
            Engine.congratulations();
        }

    }

    public static int generateProgression() {
        int minRange = 1;
        int maxRange = 10;
        int step = Engine.rnd(minRange, maxRange);
        int firstNumb = Engine.rnd();
        int index = Engine.rnd(minRange, maxRange);
        int rightNumb = 0;
        System.out.print("Question: ");
        for (int i = 1; i < 11; i++) {
            if (index == i) {
                System.out.print(".." + " ");
                rightNumb = firstNumb;
            } else {
                System.out.print(firstNumb + " ");
            }
            firstNumb += step;
        }
        return rightNumb;
    }
}
