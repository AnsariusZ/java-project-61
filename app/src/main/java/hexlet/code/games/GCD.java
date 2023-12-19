package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int BOUND = 100;
    private static final int GAMEPOINT = 3;
    private static final int ARRAYCOLUMNS = 3;
    private static final int ARRAYLINES = 2;

    private static String[] generateNumbers() {
        int number1 = Utils.getRandomNumbers(0, BOUND);
        int number2 = Utils.getRandomNumbers(0, BOUND);
        int gcd = calculate(number1, number2);
        String question = number1 + " " + number2;
        String answer = String.valueOf(gcd);
        return new String[]{question, answer};
    }

    public static int calculate(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static void gameGcd() {
        final var rules = "Find the greatest common divisor of given numbers.";
        String[][] numbers = new String[ARRAYCOLUMNS][ARRAYLINES];
        for (int i = 0; i < GAMEPOINT; i += 1) {
            numbers[i] = generateNumbers();
        }

        Engine.run(rules, numbers);
    }
}
