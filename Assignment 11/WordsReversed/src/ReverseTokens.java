import java.util.Scanner;

public class ReverseTokens {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        // Read in a line of text from the user
        String line = input.nextLine();
        // Loop through the tokens in reverse order
        String[] tokens = line.split("\\s+");
        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.print(tokens[i] + " ");
        }
    }
}
