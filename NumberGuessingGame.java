package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        numGuess();
    }

    public static void numGuess() {
        Scanner inputNum = new Scanner(System.in);
        Random randomNum = new Random();

        System.out.println("You have 5 attempts to guess a number between 1 and 50");

        int randNum = randomNum.nextInt(50) + 1;
        int attempts = 0;
        do {
            System.out.println("Enter a Number Guess: ");
            int guess = inputNum.nextInt();
            attempts++;

            if (randNum == guess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < randNum) {
                System.out.println("Guess a higher number!");
                System.out.println("No. of attempts = " + attempts);

            } else {
                System.out.println("Guess a lower number!");
                System.out.println("No. of attempts = " + attempts);
            }
            if (attempts == 5) {
                System.out.println("You are out of guesses! Correct number was " + randNum);
            }

        } while (attempts < 5);
    }
}
