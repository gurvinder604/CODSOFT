import java.util.Random;
import java.util.Scanner;

//-----------------------------THE NUMBER GAME--------------------------------

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();
        int score = 0;
        boolean playAgain = true;


        System.out.println("+--------------------------------------+");
        System.out.println("+ Welcome to the Guess the Number Game! +");
        System.out.println("+---------------------------------------+");


        //------------------LOOPS AND ATTEMPTS LIMIT-------------------------

        while (playAgain) {
            int minBound = 1;
            int maxBound = 100;
            int maxAttempts = 10;
            int attempts = 0;
            boolean Won = false;

            //--------------GENERATING A RANDOM NUMBER------------------------

            int randomNumber = randomNum.nextInt(maxBound - minBound + 1) + minBound;

            System.out.println("I have generated a random number between " + minBound + " and " + maxBound + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

            //----------------LOOP FOR USER GUESS------------------------------

            while (attempts < maxAttempts && !Won) {
                System.out.print("Enter your guess: ");
                int userGuess = input.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("+ Congratulations! You guessed the correct number. +");
                    System.out.println("+--------------------------------------------------+");
                    Won = true;
                    score += (maxAttempts - attempts + 1); // Increase score based on remaining attempts
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!Won) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
            }

            System.out.println("Your current score is: " + score);

            //--------------------PROMPT USER TO PLAY AGAIN--------------------------

            System.out.print("Do you want to play again? (yes/no): ");
            String userChoice = input.next();
            playAgain = userChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your final score is: " + score);
        input.close();
    }
}
