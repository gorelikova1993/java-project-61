package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT_ANSW;

public class ProgressionGame {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 10;

    public static void startGame() {
        Engine.greetings();
        boolean isPlaying = true;
        int attempts = 0;
        while (isPlaying && attempts < CORRECT_ANSW) {
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

        if (attempts == CORRECT_ANSW) {
            Engine.congratulations();
        }

    }

    public static int generateProgression() {
        int step = Engine.rnd(MIN_RANGE, MAX_RANGE);
        int firstNumb = Engine.rnd();
        int index = Engine.rnd(MIN_RANGE, MAX_RANGE);
        int rightNumb = 0;
        System.out.print("Question: ");
        for (int i = 1; i <= MAX_RANGE; i++) {
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
