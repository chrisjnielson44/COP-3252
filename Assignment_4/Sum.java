//7.16 - Christopher Nielson
public class Sum {
    public static void main(String[] args) {
        // Initialize the sum variable to 0.0
        double sum = 0.0;

        // Use an enhanced for loop to iterate through the command-line arguments
        for (String arg : args) {
            // Convert the string argument to a double value using the parseDouble method of class Double
            double value = Double.parseDouble(arg);
            // Add the value to the sum
            sum += value;
        }

        // Print the final sum of the arguments
        System.out.println("The sum of the arguments is: " + sum);
    }
}
