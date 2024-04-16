package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {

    public static void startGame() {
        Engine.greetings();

        boolean rightAnsw = true;
        int attempts = 0;
        var symbol = "";
        int exp = 0;

        while (rightAnsw && attempts < 3) {
            var numb1 = (int) (Math.random() * 10);
            var numb2 = (int) (Math.random() * 10);

            int operation = 1 + (int) (Math.random() * ((3 - 1) + 1));

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
        if (attempts == 3) {
            Engine.congratulations();
        }
    }
}
