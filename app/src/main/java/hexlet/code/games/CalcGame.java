package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT_ANSW;

public class CalcGame {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 3;
    private static final int PLUS_SYMBOL = 3;


    public static void startGame() {
        Engine.greetings();

        boolean rightAnsw = true;
        int attempts = 0;
        var symbol = "";
        int exp = 0;

        while (rightAnsw && attempts < CORRECT_ANSW) {
            var numb1 = Engine.rnd();
            var numb2 = Engine.rnd();

            int operation = Engine.rnd(MIN_RANGE, MAX_RANGE);

            switch (operation) {
                case 1:
                    symbol = "*";
                    exp = numb1 * numb2;
                    break;
                case 2:
                    symbol = "-";
                    exp = numb1 - numb2;
                    break;
                case PLUS_SYMBOL:
                    symbol = "+";
                    exp = numb1 + numb2;
                    break;
                default:
                    break;
            }
            System.out.println("What is the result of the expression?\n"
                    + "Question: " + numb1 + " " + symbol + " " + numb2);
            System.out.println("Your answer: ");

            int playerAnsw = Engine.getAnswerInt();


            if (playerAnsw == exp) {
                System.out.println("Correct!");
                attempts++;
            } else {
                rightAnsw = false;
                Engine.againMessage(exp, playerAnsw);
            }
        }
        if (attempts == CORRECT_ANSW) {
            Engine.congratulations();
        }
    }
}
