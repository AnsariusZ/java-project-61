package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String userAnswer = scanner.next();
        System.out.println("Your choice: " + userAnswer);
        System.out.println();

        switch (userAnswer) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.gameEven();
                break;
            case "3":
                Calc.gameCalc();
                break;
            case "4":
                GCD.gameGcd();
                break;
            case "5":
                Progression.gameProgression();
                break;
            case "6":
                Prime.gamePrime();
                break;
        }

        scanner.close();
    }
}
