package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
public class Progression {
    private static String[] generateProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }

    private static String[] generateNumbers() {
        Random random = new Random();
        var first = random.nextInt(100);
        var step = random.nextInt(100);
        var length = 10;
        var hiddenNumber = random.nextInt(9);
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
}
