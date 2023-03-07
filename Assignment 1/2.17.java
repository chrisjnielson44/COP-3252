import java.util.Scanner;

public class Comparison {
public static void main(String[] args) {
// Create a Scanner object to read input from the user
Scanner input = new Scanner(System.in);

    // Prompt the user to enter the first integer
    System.out.print("Enter first integer:"); 
    int number1 = input.nextInt(); 

    // Prompt the user to enter the second integer
    System.out.print("Enter second integer:"); 
    int number2 = input.nextInt(); 

    // Prompt the user to enter the third integer
    System.out.print("Enter third integer:"); 
    int number3 = input.nextInt(); 

    // Calculate the sum, average, and product of the three integers
    int sum = number1 + number2 + number3;
    double avg = (double) sum / 3;
    int product = number1 * number2 * number3;

    // Determine the smallest of the three integers
    int smallest = number1;
    if (number2 < smallest) {
        smallest = number2;
    } 
    if (number3 < smallest) {
        smallest = number3;
    }

    // Determine the largest of the three integers
    int largest = number1;
    if (number2 > largest) {
        largest = number2;
    } 
    if (number3 > largest) {
        largest = number3;
    }

    // Print the results
    System.out.printf("Sum: %d%n", sum);
    System.out.printf("Average: %.2f%n", avg);
    System.out.printf("Product: %d%n", product);
    System.out.printf("Smallest: %d%n", smallest);
    System.out.printf("Largest: %d%n", largest);
} 
}