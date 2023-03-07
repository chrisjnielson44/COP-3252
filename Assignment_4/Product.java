//7.14 - Christopher Nielson
class Product {
    public static void main(String[] args) {
        // Call the product method with multiple arguments and print the result
        System.out.println(product(1, 2, 3, 4, 5));
        System.out.println(product(2, 3));
        System.out.println(product(10));
    }

    // Define the product method that accepts a variable number of integer arguments
    static int product(int... numbers) {
        // Initialize the result variable
        int result = 1;
        // Loop through all the numbers and multiply the result with each number
        for (int num : numbers) {
            result *= num;
        }
        // Return the final result
        return result;
    }
}
