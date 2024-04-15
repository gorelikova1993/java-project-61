package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {

    public static void startGame(){
        Engine.greetings();
        boolean isPlaying = true;
        int attempts = 1;
        while (isPlaying && attempts < 4) {
            System.out.println("What number is missing in the progression?");
            int answ = generateProgression();
            System.out.println("Your answer: ");
            int playerAnsw = Engine.returnAnswer();

            if (answ == playerAnsw) {
                System.out.println("Correct!");
                attempts++;
            } else {
                isPlaying = false;
                Engine.againMessage(answ, playerAnsw);
            }
        }


    }

    public static int generateProgression(){
        int step = Engine.rnd(1, 10);
        int firstNumb = Engine.rnd(0, 10);
        int index = Engine.rnd(1, 10);
        int rightNumb = 0;
        System.out.print("Question: ");
        for (int i = 1; i < 11; i++) {
            if (index == i) {
                System.out.print(".." + " ");
                rightNumb = firstNumb;
            } else {
                System.out.print(firstNumb + " ");
            }
            firstNumb+=step;
        }
        return rightNumb;
    }
}
