package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void gameCalc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        Scanner scanner1 = new Scanner(System.in);
        Random random = new Random();
        var i = 0;
        while (i < 3) {
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        String[] operators = {"+", "-", "*"};
        int number3 = random.nextInt(3);
        var randomOperator = operators[number3];
        String randomExample = number1 + "" + randomOperator + "" + number2;
        System.out.println("Question: " + randomExample);
        String answer = scanner1.nextLine();
        String checkAnswer = String.valueOf(calculate(randomOperator, number1, number2));
        System.out.println("Your answer: " + answer);
        if (answer.equals(checkAnswer)) {
            System.out.println("Correct!");
            i++;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + checkAnswer + "'");
            System.out.println("Let's try again, " + userName);
            scanner1.close();
        }
        }
        System.out.println("Congratulations, " + userName);
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
