import java.util.Random;
//Extra Excercise
public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[6][4];
        Random rand = new Random();

        // Fill first five rows and three columns with random integers between 0 and 9
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }

        // Fill first 5 cells of the fourth column with the sums of the integers in the corresponding rows
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            arr[i][3] = sum;
        }

        // Fill first three cells of the sixth row with the sums of the integers in the corresponding column
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += arr[j][i];
            }
            arr[5][i] = sum;
        }

        // Set the lower right cell (6,4) to 0
        arr[5][3] = 0;

        // Print the two-dimensional array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
