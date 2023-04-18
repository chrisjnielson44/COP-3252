import java.util.Scanner;

public class GuessTheNumber {
   public static void main(String[] args) {
      // Create a Scanner object for reading input from the user
      Scanner input = new Scanner(System.in);

      // Generate a random number between 1 and 1000 to be guessed
      int numberToGuess = (int) (Math.random() * 1000) + 1;

      // Initialize the guess variable
      int guess = 0;

      // Flag to control the loop for playing the game multiple times
      boolean playAgain = true;

      // Play the game as long as the user wants to play again
      while (playAgain) {
         // Prompt the user to guess a number
         System.out.println("Guess a number between 1 and 1000:");

         // Read the guess from the user
         guess = input.nextInt();

         // Loop until the correct number is guessed
         while (guess != numberToGuess) {
            // Give a hint to the user if the guess is too high or too low
            if (guess > numberToGuess) {
               System.out.println("Too high. Try again.");
            } else {
               System.out.println("Too low. Try again.");
            }

            // Read the next guess from the user
            guess = input.nextInt();
         }

         // Congratulate the user for guessing the correct number
         System.out.println("Congratulations. You guessed the number!");

         // Ask the user if they want to play again
         System.out.println("Do you want to play again? (y/n)");

         // Read the user's response and set the playAgain flag accordingly
         playAgain = input.next().equalsIgnoreCase("y");

         // If the user wants to play again, generate a new random number
         if (playAgain) {
            numberToGuess = (int) (Math.random() * 1000) + 1;
         }
      }
   }
}
