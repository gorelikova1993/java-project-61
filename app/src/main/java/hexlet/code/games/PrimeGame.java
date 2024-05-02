package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {

        var questions = new String[Engine.ROUNDS][];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, RULES);
    }

    private static String[] generateRound() {
        int numb = Engine.rnd();
        String rightAnswer = yesOrNo(isPrime(numb));

        return new String[]{String.valueOf(numb), rightAnswer};
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
