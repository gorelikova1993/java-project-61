package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT_ANSW;

public class CalcGame {


    public static void startGame() {
        Engine.greetings();

        boolean rightAnsw = true;
        int attempts = 0;
        var symbol = "";
        int exp = 0;

        while (rightAnsw && attempts < CORRECT_ANSW) {
            int minRange = 1;
            int maxRange = 3;
            var numb1 = Engine.rnd();
            var numb2 = Engine.rnd();

            int operation = Engine.rnd(minRange, maxRange);

            switch (operation) {
                case 1:
                    symbol = "*";
                    exp = numb1 * numb2;
                    break;
                case 2:
                    symbol = "-";
                    exp = numb1 - numb2;
                    break;
                case 3:
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
