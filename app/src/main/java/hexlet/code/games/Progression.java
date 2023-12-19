package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int BOUND = 100;
    private static final int GAMEPOINT = 3;
    private static final int ARRAYCOLUMNS = 3;
    private static final int ARRAYLINES = 2;
    private static final int BOUNDONE = 1;
    private static final int PROGRESSIONLENGTH = 8;

    private static String[] generateNumbers() {
        var first = Utils.getRandomNumbers(BOUNDONE, BOUND);
        var step = Utils.getRandomNumbers(BOUNDONE, BOUND);
        var hiddenNumber = Utils.getRandomNumbers(0, PROGRESSIONLENGTH - 1);
        String[] progression = generateProgression(first, step, PROGRESSIONLENGTH);
        var answer = progression[hiddenNumber];
        progression[hiddenNumber] = "..";
        var question = String.join(" ", progression);
        return new String[]{question, answer};
    }

    public static void gameProgression() {
        final var rules = "What number is missing in the progression?";
        String[][] numbers = new String[ARRAYCOLUMNS][ARRAYLINES];
        for (int i = 0; i < GAMEPOINT; i++) {
            String[] progression = generateNumbers();
            numbers[i] = progression;
        }

        Engine.run(rules, numbers);
    }

    private static String[] generateProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}
