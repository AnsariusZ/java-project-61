package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[] generateNumbers() {
        int number = Utils.getRandomNumbers(100);
        String question = String.valueOf(number);
        String answer = isEven(number) ? "yes" : "no";
        return new String[]{question, answer};
    }

    public static void gameEven() {
        final var words = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] numbers = new String[3][2];
        for (int i = 0; i < 3; i += 1) {
            numbers[i] = generateNumbers();
        }

        Engine.run(words, numbers);
    }
}
