package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int BOUND = 100;
    private static final int COUNT_ROUNDS = 3;
    private static final int ARRAYCOLUMNS = 3;
    private static final int ARRAYLINES = 2;

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] generateNumbers() {
        int number = Utils.getRandomNumbers(0, BOUND);
        String question = String.valueOf(number);
        String answer = isPrime(number) ? "yes" : "no";
        return new String[]{question, answer};
    }

    public static void gamePrime() {
        final var rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] numbers = new String[ARRAYCOLUMNS][ARRAYLINES];
        for (int i = 0; i < COUNT_ROUNDS; i += 1) {
            numbers[i] = generateNumbers();
        }

        Engine.run(rules, numbers);
    }
}
