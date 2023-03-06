// Number Guessing Game made in Java
// MIT License

import java.util.Random;
import java.util.Scanner;

public class number_guessing_game 
{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("What is your name?");
            String name = scanner.next();
            System.out.println("Hello " + name + "! Let's play the game.");
            
            int correctGuesses = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("Round " + i + ": Guess a number between 0 and 5");
                Random random = new Random();
                int answer = random.nextInt(5);
                
                int numGuesses = 0;
                while (numGuesses < 3) {
                    int guess = scanner.nextInt();
                    
                    if (guess == answer) {
                        System.out.println("Correct! You guessed the number.");
                        correctGuesses++;
                        break;
                    } else if (guess > answer) {
                        System.out.println("Incorrect. The number is lower than " + guess);
                    } else {
                        System.out.println("Incorrect. The number is higher than " + guess);
                    }
                    
                    numGuesses++;
                    if (numGuesses == 3) {
                        System.out.println("Sorry, you have used up all your guesses for this round.");
                    } else {
                        System.out.println("Try again. You have " + (3 - numGuesses) + " guesses left.");
                    }
                }
            }
            
            if (correctGuesses >= 3) {
                System.out.println("Congratulations " + name + ", you won the game!");
            } else {
                System.out.println("Sorry " + name + ", you lost the game.");
            }
        }
    }
}
