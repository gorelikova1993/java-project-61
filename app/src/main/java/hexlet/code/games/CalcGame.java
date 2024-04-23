package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT_ANSW;

public class CalcGame {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 2;
    private static final String[] SYMBOLS = {"*", "-", "+"};


    public static void startGame() {
        Engine.greetings();

        boolean rightAnsw = true;
        int attempts = 0;

        while (rightAnsw && attempts < CORRECT_ANSW) {
            var numb1 = Engine.rnd();
            var numb2 = Engine.rnd();

            int operation = Engine.rnd(MIN_RANGE, MAX_RANGE);

            System.out.println("What is the result of the expression?\n"
                    + "Question: " + numb1 + " " + SYMBOLS[operation] + " " + numb2);
            System.out.println("Your answer: ");

            int playerAnsw = Engine.getAnswerInt();


            if (playerAnsw == checkExp(operation, numb1, numb2)) {
                System.out.println("Correct!");
                attempts++;
            } else {
                rightAnsw = false;
                Engine.againMessage(checkExp(operation, numb1, numb2), playerAnsw);
            }
        }
        if (attempts == CORRECT_ANSW) {
            Engine.congratulations();
        }
    }

    public static int checkExp(int operation, int numb1, int numb2) {
        var exp = 0;

        switch (operation) {
            case 0:
                exp = numb1 * numb2;
                break;
            case 1:
                exp = numb1 - numb2;
                break;
            case 2:
                exp = numb1 + numb2;
                break;
            default:
                break;
        }
        return exp;
    }
}
