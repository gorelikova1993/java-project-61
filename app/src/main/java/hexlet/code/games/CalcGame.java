package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 2;
    private static final String[] SYMBOLS = {"*", "-", "+"};


    public static void startGame() {
        String rules = "What is the result of the expression?";
        var questions = new String[Engine.ROUNDS][];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = generateRound();
        }

        Engine.run(questions, rules);
    }

    private static String[] generateRound() {
        var numb1 = Engine.rnd();
        var numb2 = Engine.rnd();

        int operation = Engine.rnd(MIN_RANGE, MAX_RANGE);

        var question = numb1 + " " + SYMBOLS[operation] + " " + numb2;

        var rightAnswer = String.valueOf(solveExpression(operation, numb1, numb2));
        return new String[]{question, rightAnswer};
    }



    public static int solveExpression(int operation, int numb1, int numb2) {
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
