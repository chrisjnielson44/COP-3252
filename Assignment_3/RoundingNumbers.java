import java.util.Scanner;

public class RoundingNumbers {
   public static void main(String[] args) {
      // Create a Scanner object for reading input from the user
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter a decimal number
      System.out.print("Enter a decimal number: ");

      // Read the decimal number from the user
      double x = input.nextDouble();

      // Round the decimal number using the Math.floor method
      int y = (int) Math.floor(x + 0.5);

      // Print the original and rounded numbers
      System.out.println("Original number: " + x);
      System.out.println("Rounded number: " + y);
   }
}
