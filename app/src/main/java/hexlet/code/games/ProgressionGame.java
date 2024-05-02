package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 10;
    private static final String RULES = "What number is missing in the progression?";

    public static void startGame() {
        var questions = new String[Engine.ROUNDS][];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }
        Engine.run(questions, RULES);
    }

    private static String[] generateRound() {
        int step = Engine.rnd(MIN_RANGE, MAX_RANGE);
        int firstNumb = Engine.rnd();
        int index = Engine.rnd();
        int[] progression = generateProgression(MAX_RANGE, step, firstNumb);
        int rightAnswer = progression[index];
        var question = intProgressionToString(progression, index);
        return new String[]{question, String.valueOf(rightAnswer)};
    }

    public static int[] generateProgression(int length, int step, int firstNumb) {
        var numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = firstNumb;
            firstNumb += step;
        }
        return numbers;
    }

    private static String intProgressionToString(int[] numbers, int index) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == index) {
                str.append("..").append(" ");
            } else {
                str.append(numbers[i]).append(" ");
            }
        }
        return str.toString();
    }
}
