import java.util.InputMismatchException;
import java.util.Scanner;

// Define a class called DivideByZeroWithExceptionHandling
public class DivideByZeroWithExceptionHandling {// Define a static method called quotient that accepts two integer arguments, numerator and denominator and returns their quotient

    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    // Define the main method
    public static void main(String[] args) {

        // Create a new Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Initialize some variables
        boolean continueLoop = true;
        int numerator = 0;
        int denominator = 0;

        // Start a do-while loop
        do {
            try {

                // Ask the user for the numerator and denominator
                System.out.print("Please enter an integer numerator: ");
                numerator = scanner.nextInt();

                System.out.print("Please enter an integer denominator: ");
                denominator = scanner.nextInt();

                // If the denominator is zero, throw an exception
                if (denominator == 0) {
                    throw new ArithmeticException("Oops, can't do that.\nZero is an invalid denominator. \nPlease Try again.");
                }

                // If the denominator is not zero, calculate the quotient and print the result
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

                // Set the continueLoop variable to false to exit the loop
                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {

                // If the user entered a non-integer value, catch the exception, print an error message and prompt the user to try again
                System.err.printf("%nException: %s%n", inputMismatchException);
                scanner.nextLine();
                System.out.printf("You must enter integers. Please try again.%n%n");

            } catch (ArithmeticException arithmeticException) {

                // If the user entered zero as the denominator, catch the exception, print an error message and prompt the user to try again
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");

            } finally {

                // Print the values of numerator and denominator, whether an exception was thrown or not
                System.out.printf("%nNumerator is %d%n", numerator);
                System.out.printf("Denominator is %d%n", denominator);

            }
        } while (continueLoop);

        // Close the scanner object
        scanner.close();
    }
}