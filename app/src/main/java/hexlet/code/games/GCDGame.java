package hexlet.code.games;
import hexlet.code.Engine;

public class GCDGame {
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        var questions = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, RULES);
    }

    private static String[] generateRound() {
        int numb1 = Engine.rnd();
        int numb2 = Engine.rnd();

        int rightGcd = gcd(numb1, numb2);
        var question = numb1 + " " + numb2;
        return new String[]{question, String.valueOf(rightGcd)};
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
