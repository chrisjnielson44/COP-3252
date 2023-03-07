//7.15 - Christopher Nielson
public class InitArray {
  public static void main(String[] args) {
    int size = 10; // default size of the array

    // If a command-line argument is supplied, use it as the size of the array
    if (args.length > 0) {
      size = Integer.parseInt(args[0]);
    }

    // Declare the array and initialize it with an array object of the specified size
    int[] array = new int[size];

    System.out.printf("%s%8s%n", "Index", "Value"); // column headings

    // Output each array element's value
    for (int counter = 0; counter < array.length; counter++) {
      System.out.printf("%5d%8d%n", counter, array[counter]);
    }
  }
}
