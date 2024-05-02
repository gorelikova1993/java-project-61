package hexlet.code.games;
import hexlet.code.Engine;

public class EvenGame {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 10;
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {

        var questions = new String[Engine.ROUNDS][];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }

        Engine.run(questions, RULES);

    }
    private static String[] generateRound() {
        var question = Engine.rnd(MIN_RANGE, MAX_RANGE);
        var correctAnswer = isEven(question) ? "yes" : "no";
        return new String[]{String.valueOf(question), correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
