package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
public class Prime {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i += 1) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] generateNumbers() {
        Random random = new Random();
        int number = random.nextInt(100);
        String question = String.valueOf(number);
        String answer = isPrime(number) ? "yes" : "no";
        return new String[]{question, answer};
    }

    public static void gamePrime() {
        final var words = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] numbers = new String[3][2];
        for (int i = 0; i < 3; i += 1) {
            numbers[i] = generateNumbers();
        }

        Engine.run(words, numbers);
    }
}
