package hexlet.code.games;


import hexlet.code.Engine;

public class EvenGame {

    public static void startGame() {
        Engine.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var isAnswright = true;
        var attempts = 0;

        while (isAnswright && attempts < 3) {
            var numb = (int) (Math.random() * 10);
            System.out.println("Question: " + numb);
            System.out.println("Your answer: ");


            var playerAnsw = Engine.getAnswerString();
            if (numb % 2 == 0 && playerAnsw.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
                attempts++;
            }
            if (numb % 2 == 0 && playerAnsw.equalsIgnoreCase("no")) {
                isAnswright = false;
                Engine.againMessage("yes", "no");
            }
            if (numb % 2 != 0 && playerAnsw.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
                attempts++;
            }
            if (numb % 2 != 0 && playerAnsw.equalsIgnoreCase("yes")) {
                Engine.againMessage("no", "yes");
                isAnswright = false;
            }

        }
    }

}
