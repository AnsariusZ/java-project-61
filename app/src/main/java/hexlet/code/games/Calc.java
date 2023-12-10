package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Calc {
    private static String getRandomOperator() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String[] operators = {"+", "-", "*"};
        return operators[randomNumber];
    }
    private static String[] generateNumbers() {
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        String operator = getRandomOperator();
        String question = number1 + " " + operator + " " + number2;
        String answer = String.valueOf(calculate(operator, number1, number2));
        return new String[]{question, answer};
    }
    public static void gameCalc() {
        final var words = "What is the result of the expression?";
        String[][] numbers = new String[3][2];
        for (int i = 0; i < 3; i += 1) {
            numbers[i] = generateNumbers();
        }

        Engine.run(words, numbers);
    }
    private static int calculate(String operator, int number1, int number2) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            default:
                return 0;
        }
    }
}
