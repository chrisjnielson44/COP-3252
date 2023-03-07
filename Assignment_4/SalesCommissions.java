//7.10 - Christopher Nielson
public class SalesCommissions {
    public static void main(String[] args) {
        // Initialize the salesArray with 10 salespeople's sales in dollars
        int[] salesArray = {5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, 6000};
        
        // Initialize an array of 9 counters to keep track of the number of salespeople in each salary range
        int[] salaryRanges = new int[9];

        // Calculate the salary for each salesperson and increment the corresponding salary range counter
        for (int i = 0; i < salesArray.length; i++) {
            int salary = 200 + (int) (0.09 * salesArray[i]);
            if (salary >= 1000) {
                // If salary is $1,000 and over, increment the last counter
                salaryRanges[8]++;
            } else {
                // Calculate the index in the salaryRanges array based on the salary amount
                int index = (salary - 200) / 100;
                salaryRanges[index]++;
            }
        }

        // Print the results in tabular format
        System.out.println("Salary Range          Number of Salespeople");
        System.out.println("------------------------------------------------");
        System.out.println("$200–299            " + salaryRanges[0]);
        System.out.println("$300–399             " + salaryRanges[1]);
        System.out.println("$400–499             " + salaryRanges[2]);
        System.out.println("$500–599             " + salaryRanges[3]);
        System.out.println("$600–699             " + salaryRanges[4]);
        System.out.println("$700–799             " + salaryRanges[5]);
        System.out.println("$800–899             " + salaryRanges[6]);
        System.out.println("$900–999             " + salaryRanges[7]);
        System.out.println("$1,000 and over      " + salaryRanges[8]);
    }
}
