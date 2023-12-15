package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static String getRandomOperator() {
        int randomNumber = Utils.getRandomNumbers(3);
        String[] operators = {"+", "-", "*"};
        return operators[randomNumber];
    }
    private static String[] generateNumbers() {
        int number1 = Utils.getRandomNumbers(100);
        int number2 = Utils.getRandomNumbers(100);
        String operator = getRandomOperator();
        String question = number1 + " " + operator + " " + number2;
        String answer = String.valueOf(calculate(operator, number1, number2));
        return new String[]{question, answer};
    }
    public static void gameCalc() {
        final var rules = "What is the result of the expression?";
        String[][] numbers = new String[3][2];
        for (int i = 0; i < 3; i += 1) {
            numbers[i] = generateNumbers();
        }

        Engine.run(rules, numbers);
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
                throw new RuntimeException("Для оператора " + operator + " не определена логика.");
        }
    }
}
