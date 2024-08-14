import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Guess the Number Game!");

        while (playAgain) {
            int lowerBound = 1;
            int upperBound = 100;
            int maxAttempts = 10;
            int attempts = 0;
            boolean hasWon = false;

            // Generate a random number
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

            System.out.println("I have generated a random number between " + lowerBound + " and " + upperBound + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

            // Loop for user's guesses
            while (attempts < maxAttempts && !hasWon) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    hasWon = true;
                    score += (maxAttempts - attempts + 1); // Increase score based on remaining attempts
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!hasWon) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
            }

            System.out.println("Your current score is: " + score);

            // Prompt user to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String userResponse = scanner.next();
            playAgain = userResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your final score is: " + score);
        scanner.close();
    }
}
