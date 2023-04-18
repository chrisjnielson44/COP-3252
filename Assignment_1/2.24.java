import java.util.Scanner;

public class IntegerComparison {
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

    // Prompt the user to enter the fourth integer
    System.out.print("Enter fourth integer:"); 
    int number4 = input.nextInt(); 

    // Prompt the user to enter the fifth integer
    System.out.print("Enter fifth integer:"); 
    int number5 = input.nextInt(); 

    // Determine the smallest of the five integers
    int smallest = number1;
    if (number2 < smallest) {
        smallest = number2;
    } 
    if (number3 < smallest) {
        smallest = number3;
    }
    if (number4 < smallest) {
        smallest = number4;
    }
    if (number5 < smallest) {
        smallest = number5;
    }

    // Determine the largest of the five integers
    int largest = number1;
    if (number2 > largest) {
        largest = number2;
    } 
    if (number3 > largest) {
        largest = number3;
    }
    if (number4 > largest) {
        largest = number4;
    }
    if (number5 > largest) {
        largest = number5;
    }

    // Print the results
    System.out.printf("Smallest: %d%n", smallest);
    System.out.printf("Largest: %d%n", largest);
    } 
}