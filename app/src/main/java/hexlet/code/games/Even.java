package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int BOUND = 100;
    private static final int COUNT_ROUNDS = 3;
    private static final int ARRAYCOLUMNS = 3;
    private static final int ARRAYLINES = 2;

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[] generateNumbers() {
        int number = Utils.getRandomNumbers(0, BOUND);
        String question = String.valueOf(number);
        String answer = isEven(number) ? "yes" : "no";
        return new String[]{question, answer};
    }

    public static void gameEven() {
        final var rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] numbers = new String[ARRAYCOLUMNS][ARRAYLINES];
        for (int i = 0; i < COUNT_ROUNDS; i += 1) {
            numbers[i] = generateNumbers();
        }

        Engine.run(rules, numbers);
    }
}
