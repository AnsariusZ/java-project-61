package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class GCD {
    private static String[] generateNumbers() {
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
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
        final var words = "Find the greatest common divisor of given numbers.";
        String[][] numbers = new String[3][2];
        for (int i = 0; i < 3; i += 1) {
            numbers[i] = generateNumbers();
        }

        Engine.run(words, numbers);
    }
}
