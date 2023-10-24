import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + lowerBound + " and " + upperBound + ". Try to guess it.");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            attempts++;
            
            if (playerGuess < lowerBound || playerGuess > upperBound) {
                System.out.println("Your guess is out of the valid range.");
            } else if (playerGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
                System.out.println("You took " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
