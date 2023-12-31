package hexlet.code;

import java.util.Scanner;
public class Engine {
    private static final int COUNT_ROUNDS = 3;

    public static void run(String rules, String[][] questionAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            String question = questionAndAnswers[i][0];
            String correctAnswer = questionAndAnswers[i][1];
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
                String firstpart = "'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was ";
                System.out.println(firstpart + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
