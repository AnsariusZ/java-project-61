package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        Scanner scanner1 = new Scanner(System.in);
        Random random = new Random();
        var i = 0;
        while(i < 3) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            String answer = scanner1.nextLine();
            System.out.println("Your answer: " + answer);
            if ((number % 2 == 0 && answer.equals("yes")) || (number % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + (number % 2 == 0 ? "yes" : "no") + "'.");
                System.out.println("Let's try again");
                scanner1.close();
            }
        }
        System.out.println("Congratulations, " +userName + "!");
    }
}
