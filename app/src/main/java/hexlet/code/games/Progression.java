package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static String[] generateNumbers() {
        var first = Utils.getRandomNumbers(100);
        var step = Utils.getRandomNumbers(100);
        var length = 10;
        var hiddenNumber = Utils.getRandomNumbers(9);
        String[] progression = generateProgression(first, step, length);
        var answer = progression[hiddenNumber];
        progression[hiddenNumber] = "..";
        var question = String.join(" ", progression);
        return new String[]{question, answer};
    }

    public static void gameProgression() {
        final var words = "What number is missing in the progression?";
        String[][] numbers = new String[3][2];
        for (int i = 0; i < 3; i++) {
            String[] progression = generateNumbers();
            numbers[i] = progression;
        }

        Engine.run(words, numbers);
    }

    private static String[] generateProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}
