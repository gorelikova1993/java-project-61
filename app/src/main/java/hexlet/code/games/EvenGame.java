package hexlet.code.games;
import hexlet.code.Engine;

public class EvenGame {

    public static void startGame() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var questions = new String[Engine.ROUNDS][];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();

        }

        Engine.run(questions, rules);

    }
    private static String[] generateRound() {
        var question = Engine.rnd(1, 10);
        var correctAnswer = isEven(question) ? "yes" : "no";
        return new String[]{String.valueOf(question), correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }



}
